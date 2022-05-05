package com.example.pdmpersistence.Persistencia

import com.google.gson.annotations.SerializedName

data class ResponseAPI (@SerializedName("status") var status:String,
@SerializedName("message") var response: List<String>)