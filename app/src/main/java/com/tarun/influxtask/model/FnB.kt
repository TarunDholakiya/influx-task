package com.tarun.influxtask.model

import com.google.gson.annotations.SerializedName

data class FnB(
        @SerializedName("status")
        val status: Status = Status(),
        @SerializedName("Currency")
        val currency: String = "",
        @SerializedName("FoodList")
        val foodList: List<Food> = listOf()
)