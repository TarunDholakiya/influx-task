package com.tarun.influxtask.model

import com.google.gson.annotations.SerializedName

data class Fnblist(
        @SerializedName("Cinemaid") val cinemaid: String = "",
        @SerializedName("TabName") val tabName: String = "",
        @SerializedName("VistaFoodItemId") val vistaFoodItemId: String = "",
        @SerializedName("Name") val name: String = "",
        @SerializedName("PriceInCents") val priceInCents: String = "",
        @SerializedName("ItemPrice") val itemPrice: String = "",
        @SerializedName("SevenStarExperience") val sevenStarExperience: String = "",
        @SerializedName("OtherExperience") val otherExperience: String = "",
        @SerializedName("SubItemCount") val subItemCount: Int = 0,
        @SerializedName("ImageUrl") val imageUrl: String = "",
        @SerializedName("ImgUrl") val imgUrl: String = "",
        @SerializedName("VegClass") val vegClass: String = "",
        @SerializedName("subitems") val subitems: List<Any> = listOf()
)