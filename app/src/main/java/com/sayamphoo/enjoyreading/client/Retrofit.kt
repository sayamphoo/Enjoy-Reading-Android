package com.sayamphoo.enjoyreading.client

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {
    private lateinit var retrofit:Retrofit

    init {
        setRetrofit()
    }

    private fun setRetrofit() {
        retrofit = Retrofit.Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}