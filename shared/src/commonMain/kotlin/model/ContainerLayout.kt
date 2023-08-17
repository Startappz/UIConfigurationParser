package model

import kotlinx.serialization.Serializable

@Serializable
data class ContainerLayout(
    val containerHeight: Int,
    val containerInsets: ContainerInsets,
    val containerWidth: String,
    val interContainerSpacing: Int,
    val interGroupSpacing: Int,
    val itemCountPerRow: Int? = 0,
    val scrollingBehavior: String
)