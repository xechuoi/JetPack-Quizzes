package com.compose.jettrivia.network

import com.compose.jettrivia.data.models.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {

    @GET("world.json")
    suspend fun getAllQuestions(): Question

}