package com.samadihadis.countryinformationapplication.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("all")
    fun allCountries(): Call<List<CountryModel>>

    @GET("name/{name}")
    fun searchCountry(@Path("name") countryName: String): Call<List<CountryModel>>
}