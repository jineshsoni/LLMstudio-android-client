package com.tqb.lmstudio.module.home.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.tqb.lmstudio.databinding.MainChatScreenBinding
import com.tqb.lmstudio.module.home.data.Chat
import com.tqb.lmstudio.module.home.data.ChatBy
import com.tqb.lmstudio.module.home.viewmodel.ChatViewModel
import com.tqb.lmstudio.module.home.viewmodel.ChatViewModelFactory


class ChatFragment: Fragment() {

    private var _binding: MainChatScreenBinding? = null
    private val binding get() = _binding!!
    private lateinit var chatAdapter: ChatAdapter
    private lateinit var chatVm: ChatViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = MainChatScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        clicks()
    }

    private fun init(){
        chatAdapter = ChatAdapter(requireContext());
        binding.rvChat.adapter = chatAdapter
        chatVm = ChatViewModelFactory().create(ChatViewModel::class.java)
    }

    private fun clicks() {
        binding.send.setOnClickListener {
            binding.send.isEnabled = false
            binding.etChat.isEnabled = false

            addChat(binding.etChat.text.toString(), true)
            chatVm.sendChat(binding.etChat.text.toString(), success = {
                addChat(it, false)
                binding.etChat.text?.clear()
                scrollRv()
            })

        }
    }

    private fun addChat(text: String, isUser: Boolean = true){
        chatAdapter.addChat(Chat(
            text = text,
            time = System.currentTimeMillis(),
            chatBy = if(isUser) ChatBy.USER else ChatBy.AI,
        ))
    }

    private fun scrollRv() {
        binding.rvChat.smoothScrollToPosition(chatAdapter.itemCount)
        binding.send.isEnabled = true
        binding.etChat.isEnabled = true
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}