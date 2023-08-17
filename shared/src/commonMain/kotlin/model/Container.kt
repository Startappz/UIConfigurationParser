package model

import kotlinx.serialization.Serializable

@Serializable
data class Container(
    val containerID: String,
    val containerLayout: ContainerLayout,
    val headerConfiguration: HeaderConfiguration,
    val itemView: ItemView,
    val type: String
)