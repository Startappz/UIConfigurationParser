package model

import kotlinx.serialization.Serializable

@Serializable
data class UiConfigurationContainerDataItem(
    val description: String,
    val imageURL: String,
    val title: String,
    val type: String
)
