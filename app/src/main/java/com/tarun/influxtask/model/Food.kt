package com.tarun.influxtask.model

import com.google.gson.annotations.SerializedName

data class Food(
        @SerializedName("TabName") val tabName: String = "",
        @SerializedName("fnblist") val fnblist: List<Fnblist> = listOf()
)