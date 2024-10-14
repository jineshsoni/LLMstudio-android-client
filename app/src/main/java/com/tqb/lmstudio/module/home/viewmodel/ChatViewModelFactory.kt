package com.tqb.lmstudio.module.home.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.tqb.lmstudio.module.home.network.ChatApiProvider
import com.tqb.lmstudio.module.home.repo.ChatRepoImpl

class ChatViewModelFactory : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ChatViewModel::class.java)) {
            return ChatViewModel(
                chat = ChatRepoImpl(
                    chatApiProvider = ChatApiProvider
                )
            ) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}