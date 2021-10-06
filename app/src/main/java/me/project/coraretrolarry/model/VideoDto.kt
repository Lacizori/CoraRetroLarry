package me.project.coraretrolarry.model


import com.google.gson.annotations.SerializedName

data class VideoDto(
    @SerializedName("added")
    val added: String,
    @SerializedName("default_thumb")
    val defaultThumb: ThumbDto,
    @SerializedName("embed")
    val embed: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("keywords")
    val keywords: String,
    @SerializedName("length_min")
    val lengthMin: String,
    @SerializedName("length_sec")
    val lengthSec: Int,
    @SerializedName("rate")
    val rate: String,
    @SerializedName("thumbs")
    val thumbs: List<ThumbDto>,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("views")
    val views: Int
)