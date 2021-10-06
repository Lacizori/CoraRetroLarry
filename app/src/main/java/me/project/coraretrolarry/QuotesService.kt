package me.project.coraretrolarry

import retrofit2.http.GET
import retrofit2.http.Query

interface QuotesService {
    @GET("generate_insult.php")
    fun getQuote(
        @Query("lang") lang: String = "ru",
        @Query("type") type: String = "json",
    ): String
}
