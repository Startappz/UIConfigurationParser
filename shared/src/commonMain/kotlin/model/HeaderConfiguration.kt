package model

import kotlinx.serialization.Serializable

@Serializable
data class HeaderConfiguration(
    val isVisible: Boolean,
    val height: Int? = 0,
    val color: String? = null,
    val font: String? = null,
    val size: Int? = 0,
)