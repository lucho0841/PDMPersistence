package com.example.pdmpersistence.Persistencia

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    fun getById(@Url url:String) : Call<ResponseAPI>
}