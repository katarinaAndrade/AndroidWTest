package com.kat.core.navigation.di

import com.kat.core.navigation.navigation.AppNavigation
import org.koin.dsl.module

object NavigationKoinModule {

    val navigationKoinModule = module {
        single {
            AppNavigation(get())
        }
    }

}