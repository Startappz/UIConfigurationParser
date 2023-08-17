package model

import kotlinx.serialization.Serializable

@Serializable
data class ItemView(
    val actionID: String,
    val type: String
)