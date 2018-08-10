package com.tarun.influxtask.application

import android.app.Application
import com.tarun.influxtask.di.AppModule
import com.tarun.influxtask.di.CoreComponent

open class CoreApp : Application() {

    companion object {
        lateinit var coreComponent: CoreComponent
    }

    override fun onCreate() {
        super.onCreate()
        initDI()
    }


    private fun initDI() {
       coreComponent = DaggerCoreComponent.builder().appModule(AppModule(this)).build()
    }
}