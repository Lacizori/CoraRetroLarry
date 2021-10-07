package me.project.coraretrolarry.model

import com.google.gson.annotations.SerializedName

data class ThumbDto(
    @SerializedName("height")
    val height: Int,
    @SerializedName("size")
    val size: ThumbSize,
    @SerializedName("src")
    val src: String,
    @SerializedName("width")
    val width: Int
)