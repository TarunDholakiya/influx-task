package com.tarun.influxtask.di

import android.content.Context
import android.content.SharedPreferences
import com.squareup.picasso.Picasso
import dagger.Component
import io.reactivex.Scheduler
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component()
interface CoreComponent {

    fun context(): Context

    fun retrofit(): Retrofit

    fun picasso(): Picasso

    fun sharedPreferences(): SharedPreferences

    fun scheduler(): Scheduler
}