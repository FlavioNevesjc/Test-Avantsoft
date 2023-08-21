package com.example.avantsofttest.api

import com.example.avantsofttest.model.UsersResult
import io.reactivex.Maybe
import retrofit2.http.GET

interface IEndpoint {

    @GET("/v3/ce47ee53-6531-4821-a6f6-71a188eaaee0")
    fun getCurrencies() : Maybe<UsersResult>
}