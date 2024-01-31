package com.samadihadis.countryinformationapplication.util

import com.samadihadis.countryinformationapplication.data.ApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://restcountries.com/v3.1/"

    private val logging = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
    private val client = OkHttpClient.Builder().run {
        addInterceptor(logging)
        build()
    }
    private val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(client).build()

    val apiService : ApiService = retrofit.create(ApiService::class.java)
}