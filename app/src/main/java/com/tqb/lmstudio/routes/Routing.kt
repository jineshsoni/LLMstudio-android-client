package com.tqb.lmstudio.routes

import android.content.Context
import android.content.Intent
import com.tqb.lmstudio.module.home.view.MainActivity

object Routing {

    fun goToChat(context: Context){
        context.startActivity(Intent(context, MainActivity::class.java))
    }

}