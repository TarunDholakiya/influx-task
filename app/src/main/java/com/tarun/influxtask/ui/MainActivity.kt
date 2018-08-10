package com.tarun.influxtask.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.tarun.influxtask.R
import com.tarun.influxtask.model.FnB
import com.tarun.influxtask.viewmodel.FnBListViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: FnBListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(FnBListViewModel::class.java)
        observeViewModel()

    }

    private fun observeViewModel() {
        viewModel.getProjectListObservable().observe(this, Observer<FnB> { fnb ->
            Log.i("TAG", "" + fnb)
        })
    }
}