package com.tarun.influxtask.di

import android.content.Context
import android.content.SharedPreferences
import com.squareup.picasso.Picasso
import com.tarun.influxtask.networking.Scheduler
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ImageModule::class, StorageModule::class, NetworkModule::class])
interface AppComponent {
    fun context(): Context

    fun retrofit(): Retrofit

    fun picasso(): Picasso

    fun sharedPreferences(): SharedPreferences

    fun scheduler(): Scheduler
}