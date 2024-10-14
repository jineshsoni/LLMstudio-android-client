package com.tqb.lmstudio.module.home.data.modelresp


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("object")
    val objectX: String? = "",
    @SerializedName("owned_by")
    val ownedBy: String? = "",
    @SerializedName("permission")
    val permission: List<Permission?>? = listOf()
)