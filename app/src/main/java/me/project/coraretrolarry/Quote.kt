package me.project.coraretrolarry


import com.google.gson.annotations.SerializedName

data class Quote(
    @SerializedName("number")
    val id: Int,
    @SerializedName("insult")
    val quote: String,
)