package com.JRobertFinal.footballapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.JRobertFinal.footballapp.data.matchfavorite.local.response.MatchFavorite
import com.JRobertFinal.footballapp.data.teamfavorite.local.response.TeamFavorite

// Room Database class for the application
@Database(entities = [MatchFavorite::class, TeamFavorite::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    companion object {
        // Singleton instance of the AppDatabase
        private var INSTANCE: AppDatabase? = null

        // Function to get the instance of the AppDatabase
        fun getAppDatabase(context: Context): AppDatabase {
            if (INSTANCE == null) {
                // Create a new instance of AppDatabase if it doesn't exist
                INSTANCE = Room
                    .databaseBuilder(context.applicationContext, AppDatabase::class.java, "db-android")
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return INSTANCE!!
        }

        // Function to destroy the instance of the AppDatabase
        fun destroyInstance() {
            INSTANCE = null
        }
    }

    // Abstract function to provide access to FavoriteDao
    abstract fun favoriteDao(): FavoriteDao
}
