package com.tqb.lmstudio.module.home.data.chatrequest


import com.google.gson.annotations.SerializedName

data class ChatRequest(
    @SerializedName("max_tokens")
    val maxTokens: Int? = -1,
    @SerializedName("messages")
    val messages: List<Message?>? = listOf(),
    @SerializedName("model")
    val model: String? = "",
    @SerializedName("stream")
    val stream: Boolean? = false,
    @SerializedName("temperature")
    val temperature: Double? = 0.7
)