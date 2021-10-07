package me.project.coraretrolarry.model

import com.google.gson.annotations.SerializedName

enum class ThumbSize(val value: String) {

    @SerializedName("small")
    TINY("small"),

    @SerializedName("medium")
    NORMAL("medium"),

    @SerializedName("big")
    LARGE("big");

    override fun toString(): String {
        return value
    }
}