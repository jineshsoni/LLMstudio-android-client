package com.tqb.lmstudio.module.home.data.modelresp


import com.google.gson.annotations.SerializedName

data class GetModelResponse(
    @SerializedName("data")
    val `data`: List<Data?>? = listOf(),
    @SerializedName("object")
    val objectX: String? = ""
)