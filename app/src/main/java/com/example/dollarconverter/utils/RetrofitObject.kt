package com.example.dollarconverter.utils

import com.example.dollarconverter.api.ApiInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitObject {

    var mRetrofit: Retrofit = Retrofit.Builder()
        .baseUrl("http://www.apilayer.net/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val apiService: ApiInterface =  mRetrofit.create(ApiInterface::class.java)



}