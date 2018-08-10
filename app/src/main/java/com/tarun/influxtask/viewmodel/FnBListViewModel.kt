package com.tarun.influxtask.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import com.tarun.influxtask.model.FnB
import com.tarun.influxtask.repository.FnBRepository


/**
 * Created by TARUN on 10-Aug-18.
 */
class FnBListViewModel(application: Application) : AndroidViewModel(application) {
    val fnbListObservable: LiveData<FnB>

    init {
        val fnBRepository = FnBRepository()
        fnbListObservable = fnBRepository.getProjectList()
    }

    fun getProjectListObservable(): LiveData<FnB> {
        return fnbListObservable
    }
}