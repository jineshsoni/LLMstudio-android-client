package com.tqb.lmstudio.module.home.data.chatresp


import com.google.gson.annotations.SerializedName

data class Usage(
    @SerializedName("completion_tokens")
    val completionTokens: Int? = 0,
    @SerializedName("prompt_tokens")
    val promptTokens: Int? = 0,
    @SerializedName("total_tokens")
    val totalTokens: Int? = 0
)