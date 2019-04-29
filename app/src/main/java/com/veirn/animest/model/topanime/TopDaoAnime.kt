package com.veirn.animest.model.topanime

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface TopDaoAnime {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(top: TopAnime)

    @Query("select * from topAnime ")
    fun getanimetop(): List<TopAnime>

}