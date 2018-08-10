package com.tarun.influxtask.utilities

import android.app.Activity
import android.widget.ImageView
import com.squareup.picasso.Picasso


object ImageUtils {
    /**
     * Load image in picasso
     *
     * @param activity  Activity context
     * @param url       ImageUrl
     */
    fun ImageView?.loadImage(activity: Activity, url: String) {
        Picasso.with(activity)
                .load(url)
                .fit()
                .into(this)
    }

    /**
     * Load image in picasso with resize feature
     *
     * @param activity  Activity context
     * @param url       ImageUrl
     * @param width     image width
     */
    fun ImageView?.loadImage(activity: Activity, url: String, width: Int) {
        Picasso.with(activity)
                .load(url)
                .resize(width, 0)
                .into(this)
    }
}