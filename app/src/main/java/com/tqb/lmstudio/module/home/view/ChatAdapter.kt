package com.tqb.lmstudio.module.home.view

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.tqb.lmstudio.R
import androidx.databinding.library.baseAdapters.BR
import com.tqb.lmstudio.module.home.data.Chat
import com.tqb.lmstudio.module.home.data.ChatBy
import com.tqb.lmstudio.utils.network.glide

class ChatAdapter(val context: Context):
    RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

    var data: ArrayList<Chat> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            binding = DataBindingUtil.inflate(
                LayoutInflater.from(context),
                R.layout.single_chat_ui,
                parent,
                false
            )
        )
    }

    fun loadData(chatList: ArrayList<Chat>){
        this.data = chatList
        this.notifyDataSetChanged()
    }

    fun addChat(chat: Chat){
        data.add(chat)
        this.notifyDataSetChanged()
    }

    override fun getItemCount(): Int = data.count()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(data[position]){
                holder.bind(this)
            }
        }
    }

    inner class ViewHolder(val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Chat) {
            binding.setVariable(BR.data, data)
            binding.executePendingBindings()
            println("CHAT BY ==> ${data.chatBy}")
            if(data.chatBy == ChatBy.AI)
                binding.root.findViewById<AppCompatImageView>(R.id.ivAvtar).setImageResource(R.drawable.img)
            else
                binding.root.findViewById<AppCompatImageView>(R.id.ivAvtar).setImageResource(R.drawable.person_24px)
            binding.root.setOnClickListener {  }
        }
    }

}