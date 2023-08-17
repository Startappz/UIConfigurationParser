import dev.icerock.moko.mvvm.viewmodel.ViewModel
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.request.get
import io.ktor.client.request.headers
import io.ktor.http.HttpHeaders
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json
import model.UiConfigurationData
import model.UiConfigurationScheme

data class MainScreenUiState(
    val scheme: UiConfigurationScheme? = null,
    val data: UiConfigurationData? = null,
    val isLoading: Boolean = true,
    val hasError: Boolean = false,
) {
    val containers = UiDescriptionBuilder.build(scheme, data)
}

class MainScreenViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(MainScreenUiState())
    val uiState = _uiState.asStateFlow()

    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                isLenient = true

            })
        }
        install(Logging) {
            level = LogLevel.BODY

        }
    }

    init {
        updateUiConfigs()
    }

    override fun onCleared() {
        httpClient.close()
    }

    private fun updateUiConfigs() {
        viewModelScope.launch {
            val skeleton = getUiConfigs()
            val skeletonData = getConfigsData()
            _uiState.update {
                it.copy(
                    scheme = skeleton,
                    data = skeletonData,
                    isLoading = false,
                    hasError = skeleton == null || skeletonData == null
                )
            }
        }
    }

    // fetch ui skeleton
    private suspend fun getUiConfigs(): UiConfigurationScheme? {
        return try {
            httpClient
                .get("https://apigateway-dev.stpz.io/gateway/ui-config/getUIConfiguration") {
                    headers {
                        append(HttpHeaders.Accept, "application/json")
                        append("Mock-Version", "7")
                    }
                }.body()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    // fetch skeleton items (data) for example list items
    private suspend fun getConfigsData(): UiConfigurationData? {
        return try {
            httpClient
                .get("https://apigateway-dev.stpz.io/gateway/ui-config/getMockEcommerceData") {
                    headers {
                        append(HttpHeaders.Accept, "application/json")
                        append("Mock-Version", "2")
                    }
                }.body()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}