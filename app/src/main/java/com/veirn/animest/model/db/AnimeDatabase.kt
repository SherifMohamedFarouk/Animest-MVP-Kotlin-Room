package com.veirn.animest.model.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.veirn.animest.model.topanime.TopAnime
import com.veirn.animest.model.topanime.TopDaoAnime
import com.veirn.animest.model.topmanga.Top
import com.veirn.animest.model.topmanga.TopDao

@Database(
    entities = arrayOf(Top::class,TopAnime::class),
version =  3 , exportSchema = true
) abstract class AnimeDatabase : RoomDatabase() {
    abstract  fun topDao(): TopDao
    abstract  fun topDaoanime(): TopDaoAnime


    companion object {
        @Volatile private var instance: AnimeDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also { instance = it }
        }

        private  fun buildDatabase(context: Context) = Room.databaseBuilder(context
            ,AnimeDatabase::class.java
            ,"AnimeDatabaseEntries.db" )
            .fallbackToDestructiveMigration()
            .build()
        }
    }