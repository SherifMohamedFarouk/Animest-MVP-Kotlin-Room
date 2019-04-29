package com.veirn.animest.model.topanime.animedetails

import com.google.gson.annotations.SerializedName

data class To(
    @SerializedName("day")
    val day: Int, // 24
    @SerializedName("month")
    val month: Int, // 4
    @SerializedName("year")
    val year: Int // 1999
)