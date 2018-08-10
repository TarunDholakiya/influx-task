package com.tarun.influxtask.rest


object ApiClient {
    fun getApiService(): ApiInterface {
        return RetrofitConfig.getRetrofitInstance().create(ApiInterface::class.java)
    }
}