package com.tarun.influxtask.rest

import com.tarun.influxtask.model.FnB
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("5a1e7dd92f0000801eee2da5")
    fun getFandBDetails(): Call<FnB>
}