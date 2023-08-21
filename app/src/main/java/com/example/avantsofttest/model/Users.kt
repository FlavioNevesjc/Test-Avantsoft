package com.example.avantsofttest.model

import com.google.gson.annotations.SerializedName

data class Users(

    //Identificação dos itens

    @SerializedName("id")
    var Id: Int,
    @SerializedName("name")
    var Name: String,
    @SerializedName("age")
    var Age: Int,
    @SerializedName("email")
    var Email: String
)