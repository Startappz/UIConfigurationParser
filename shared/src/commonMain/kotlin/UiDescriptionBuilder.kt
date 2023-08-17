import model.Container
import model.UiConfigurationContainerData
import model.UiConfigurationData
import model.UiConfigurationScheme

object UiDescriptionBuilder {

    fun build(
        scheme: UiConfigurationScheme?,
        uiConfigurationData: UiConfigurationData?,
    ): Map<Container, UiConfigurationContainerData> {
        if (scheme == null || uiConfigurationData == null) return emptyMap()

        return scheme.containers.associateWith { container ->
            uiConfigurationData.data.first { data ->
                container.containerID == data.containerID
            }
        }
    }
}
