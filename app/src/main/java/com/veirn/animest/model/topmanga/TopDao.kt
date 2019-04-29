package com.veirn.animest.model.topmanga

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface TopDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(top: Top)

    @Query("select * from top_current ")
    fun getmangatop(): List<Top>
}