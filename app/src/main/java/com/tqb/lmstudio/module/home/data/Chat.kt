package com.tqb.lmstudio.module.home.data

data class Chat (
    val id: Int? = null,
    val text: String,
    val time: Long,
    val chatBy: ChatBy

)


enum class ChatBy{
    USER, AI
}