package me.project.coraretrolarry.network

import me.project.coraretrolarry.model.SearchDto
import me.project.coraretrolarry.model.ThumbSize
import retrofit2.http.GET
import retrofit2.http.Query

interface ImageService {

    @GET("search/")
    suspend fun getVideosBySearch(
        @Query("query") query: String,
        @Query("per_page") perPage: Int = 3,
        @Query("page") page: Int,
        @Query("thumbsize") thumbSize: ThumbSize,
        @Query("format") format: String = "json",
    ): SearchDto
}
