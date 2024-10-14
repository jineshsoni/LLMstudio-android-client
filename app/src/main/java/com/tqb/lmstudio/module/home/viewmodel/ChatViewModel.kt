package com.tqb.lmstudio.module.home.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tqb.lmstudio.module.home.data.chatrequest.ChatRequestBuilder
import com.tqb.lmstudio.module.home.data.chatresp.ChatResponseModel
import com.tqb.lmstudio.module.home.repo.ChatRepoImpl
import kotlinx.coroutines.launch

class ChatViewModel constructor(val chat: ChatRepoImpl): ViewModel() {

    val chatBuilder = ChatRequestBuilder()

    fun sendChat(text: String, success: (String) -> Unit = { }){
        viewModelScope.launch {
            val response = chat.chat(chatBuilder.buildNewChatRequest(text))
            println(response.choices?.first()?.message)
            success(response.choices?.first()?.message?.content.toString())
        }
    }

}