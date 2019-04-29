package com.veirn.animest.model.topanime.animedetails

import com.google.gson.annotations.SerializedName

data class Aired(
    @SerializedName("from")
    val from: String, // 1998-04-03T00:00:00+00:00
    @SerializedName("prop")
    val prop: Prop,
    @SerializedName("string")
    val string: String, // Apr 3, 1998 to Apr 24, 1999
    @SerializedName("to")
    val to: String // 1999-04-24T00:00:00+00:00
)