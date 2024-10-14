package com.tqb.lmstudio.utils.network

import com.tqb.lmstudio.R
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


interface RetrofitClient {

    companion object {

    }


}

object RClient {

    var retrofit = Retrofit.Builder()
        .baseUrl("")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}