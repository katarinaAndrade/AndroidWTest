package com.kat.core.data.data.storage.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kat.core.data.data.model.PostalCode
import com.kat.core.data.data.storage.StorageDao

@Database(entities = [PostalCode::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun storageDao(): StorageDao

    companion object {

        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            if (INSTANCE == null){
                INSTANCE = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "androidWTest")
                    .build()
            }

            return INSTANCE as AppDatabase
        }

    }

}