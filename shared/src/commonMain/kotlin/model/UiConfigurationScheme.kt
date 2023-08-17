package model

import kotlinx.serialization.Serializable

@Serializable
data class UiConfigurationScheme(
    val containers: List<Container>
)