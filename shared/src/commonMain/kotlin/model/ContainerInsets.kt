package model

import kotlinx.serialization.Serializable

@Serializable
data class ContainerInsets(
    val bottom: Int,
    val left: Int,
    val right: Int,
    val top: Int
)