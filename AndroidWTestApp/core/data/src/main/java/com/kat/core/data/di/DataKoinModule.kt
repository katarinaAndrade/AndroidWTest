package com.kat.core.data.di

import com.kat.core.data.data.storage.db.AppDatabase
import com.kat.core.data.data.storage.db.AppDatabaseImpl
import org.koin.dsl.module

object DataKoinModule {

    val dataKoinModule = module {

        single {
            AppDatabaseImpl(AppDatabase.getInstance(get()))
        }

    }

}