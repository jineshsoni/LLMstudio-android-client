package com.tqb.lmstudio.module.home.data.chatrequest

class ChatRequestBuilder(val sysMessage: String? = null) {
    val systemMessage = "Answer any question with best witty response"

    fun buildNewChatRequest(message: String) : ChatRequest{
        return ChatRequest(
            messages = listOf(Message(
                content = message,
                role = "user"
            ), Message(
                content = sysMessage ?: systemMessage,
                role = "system"
            ))
        )
    }
}