package com.tarun.influxtask.model

import com.google.gson.annotations.SerializedName

data class Status(
        @SerializedName("Id") val id: String = "",
        @SerializedName("Description") val description: String = ""
)