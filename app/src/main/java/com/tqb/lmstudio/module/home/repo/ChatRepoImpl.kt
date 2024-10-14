package com.tqb.lmstudio.module.home.repo

import com.tqb.lmstudio.module.home.data.chatrequest.ChatRequest
import com.tqb.lmstudio.module.home.data.chatresp.ChatResponseModel
import com.tqb.lmstudio.module.home.data.modelresp.GetModelResponse
import com.tqb.lmstudio.module.home.network.ChatApiProvider

class ChatRepoImpl(val chatApiProvider: ChatApiProvider) : ChatRepo {

    override suspend fun chat(buildNewChatRequest: ChatRequest): ChatResponseModel {
        return chatApiProvider.getChatApi().chat(buildNewChatRequest)
    }

    override suspend fun loadModels(): GetModelResponse {
        return chatApiProvider.getChatApi().getModels()
    }

}