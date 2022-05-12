package com.example.pdmpersistence.Persistencia

import com.google.gson.annotations.SerializedName

data class ResponseAPI (
    @SerializedName("id") var id:Int,
    @SerializedName("documentType") var documentType: String,
    @SerializedName("documentNumber") var documentNumber: Int,
    @SerializedName("firstName") var firstName: String,
    @SerializedName("secondName") var secondName: String,
    @SerializedName("lastName") var lastName: String,
    @SerializedName("secondSurname") var secondSurname: String,
    @SerializedName("sex") var sex: String,
    @SerializedName("birthDate") var birthDate: String,
    @SerializedName("email") var email: String,
    @SerializedName("cellphone") var cellphone: String,
    @SerializedName("createdDate") var createdDate: String,
    @SerializedName("modifiedDate") var modifiedDate: String,
)
