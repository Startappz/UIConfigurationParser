package model

import kotlinx.serialization.Serializable

@Serializable
data class UiConfigurationData(
    val data: List<UiConfigurationContainerData>
)
