package com.example.vaccinenotifier.Service

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {
    private val client = OkHttpClient.Builder().build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://cdn-api.co-vin.in/api/v2/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    var apiservice: ApiService = retrofit.create(ApiService::class.java)
}