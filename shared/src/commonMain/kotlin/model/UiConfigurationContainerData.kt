package model

import kotlinx.serialization.Serializable

@Serializable
data class UiConfigurationContainerData(
    val containerID: String,
    val containerTitle: String,
    val items: List<UiConfigurationContainerDataItem>,
    val sectionTitle: String
)
