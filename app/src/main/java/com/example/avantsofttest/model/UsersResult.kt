package com.example.avantsofttest.model

import com.google.gson.annotations.SerializedName

data class UsersResult(

    //Identificação dos itens

    @SerializedName("users")
    var Users: List<Users>
)