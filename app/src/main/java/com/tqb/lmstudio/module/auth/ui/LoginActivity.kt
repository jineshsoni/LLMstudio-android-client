package com.tqb.lmstudio.module.auth.ui

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.tqb.lmstudio.R
import com.tqb.lmstudio.databinding.ActivityLoginBinding
import com.tqb.lmstudio.databinding.ActivityMainBinding
import com.tqb.lmstudio.routes.Routing

class LoginActivity: AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityLoginBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.enter!!.setOnClickListener {
            Routing.goToChat(this@LoginActivity)
        }
    }
}