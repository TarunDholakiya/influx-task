package com.tarun.influxtask.utilities

import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

fun Activity.toast(message: String?, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

fun Activity.isOnline(): Boolean {
    var isConnected = false
    try {
        val cm = this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        isConnected = cm.activeNetworkInfo != null
                && cm.activeNetworkInfo.isAvailable
                && cm.activeNetworkInfo.isConnected
        if (isConnected) return isConnected
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return isConnected
}

fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}

fun ViewGroup.inflateActivity(actvity: Activity = context as Activity, layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(actvity).inflate(layoutId, this, attachToRoot)
}

