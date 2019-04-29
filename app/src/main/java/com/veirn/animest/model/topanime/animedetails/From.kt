package com.veirn.animest.model.topanime.animedetails

import com.google.gson.annotations.SerializedName

data class From(
    @SerializedName("day")
    val day: Int, // 3
    @SerializedName("month")
    val month: Int, // 4
    @SerializedName("year")
    val year: Int // 1998
)