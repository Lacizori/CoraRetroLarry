package me.project.coraretrolarry.model

import com.google.gson.annotations.SerializedName

data class SearchDto(
    @SerializedName("count")
    val count: Int,
    @SerializedName("page")
    val page: Int,
    @SerializedName("per_page")
    val perPage: Int,
    @SerializedName("start")
    val start: Int,
    @SerializedName("time_ms")
    val timeMs: Int,
    @SerializedName("total_count")
    val totalCount: String,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("videos")
    val videos: List<VideoDto>
)