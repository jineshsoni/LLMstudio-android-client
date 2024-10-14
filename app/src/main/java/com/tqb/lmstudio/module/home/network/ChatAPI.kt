package com.tqb.lmstudio.module.home.network

import com.tqb.lmstudio.BuildConfig
import com.tqb.lmstudio.module.home.data.chatrequest.ChatRequest
import com.tqb.lmstudio.module.home.data.chatresp.ChatResponseModel
import com.tqb.lmstudio.module.home.data.modelresp.GetModelResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


object ChatApiProvider {
    fun getChatApi(): ChatAPI {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ChatAPI::class.java)
    }
}

interface ChatAPI {
    @POST("/v1/chat/completions")
    suspend fun chat(@Body buildNewChatRequest: ChatRequest): ChatResponseModel

    @GET("/v1/models")
    suspend fun getModels(): GetModelResponse
}