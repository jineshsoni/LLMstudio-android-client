package com.tqb.lmstudio.module.home.data.chatresp


import com.google.gson.annotations.SerializedName

data class ChatResponseModel(
    @SerializedName("choices")
    val choices: List<Choice?>? = listOf(),
    @SerializedName("created")
    val created: Int? = 0,
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("model")
    val model: String? = "",
    @SerializedName("object")
    val objectX: String? = "",
    @SerializedName("usage")
    val usage: Usage? = Usage()
)