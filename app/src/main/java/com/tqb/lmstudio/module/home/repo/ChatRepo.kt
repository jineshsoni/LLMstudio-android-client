package com.tqb.lmstudio.module.home.repo

import com.tqb.lmstudio.module.home.data.chatrequest.ChatRequest
import com.tqb.lmstudio.module.home.data.chatresp.ChatResponseModel
import com.tqb.lmstudio.module.home.data.modelresp.GetModelResponse

interface ChatRepo{

    suspend fun chat(buildNewChatRequest: ChatRequest): ChatResponseModel

    suspend fun loadModels(): GetModelResponse

}