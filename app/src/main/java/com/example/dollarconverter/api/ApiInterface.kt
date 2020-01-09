package com.example.dollarconverter.api

import com.example.dollarconverter.model.UsdToInr
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("live?access_key=62f09438edde5143366f0c305a7f1c8f")
    fun getData(): Call<UsdToInr>
}