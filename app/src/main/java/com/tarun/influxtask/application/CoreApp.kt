package com.tarun.influxtask.application

import android.app.Application
import com.tarun.influxtask.di.AppComponent
import com.tarun.influxtask.di.AppModule
import com.tarun.influxtask.di.DaggerAppComponent


open class CoreApp : Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()
        initDI()
    }


    private fun initDI() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}