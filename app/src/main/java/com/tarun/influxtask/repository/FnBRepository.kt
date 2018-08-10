package com.tarun.influxtask.repository

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.tarun.influxtask.model.FnB
import com.tarun.influxtask.rest.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FnBRepository {
    fun getProjectList(): LiveData<FnB> {
        val data = MutableLiveData<FnB>()
        ApiClient.getApiService().getFandBDetails().enqueue(object : Callback<FnB> {
            override fun onResponse(call: Call<FnB>?, response: Response<FnB>) {
                data.value = response.body()
            }

            override fun onFailure(call: Call<FnB>?, t: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
        return data
    }

}