package com.kat.androidwtest.di

import com.kat.androidwtest.screen.viewmodel.SplashViewModel
import com.kat.androidwtest.screen.viewmodel.SplashViewModelImpl
import com.kat.app.domain.di.AppDomainKoinModule
import com.kat.core.data.di.DataKoinModule
import com.kat.core.navigation.di.NavigationKoinModule
import com.kat.core.navigation.navigation.AppLifecycleCallBack
import com.kat.core.network.di.NetworkKoinModule
import com.kat.home.domain.di.HomeDomainKoinModule
import com.kat.home.ui.di.HomeUIKoinModule
import org.koin.dsl.module

object AppKoinModule {

    private val appKoinModule = module {
        single {
            AppLifecycleCallBack()
        }
        single<SplashViewModel> {
            SplashViewModelImpl(get())
        }
    }

    val startKoinModules = listOf(
        appKoinModule,
        AppDomainKoinModule.appDomainKoinModule,
        DataKoinModule.dataKoinModule,
        NavigationKoinModule.navigationKoinModule,
        NetworkKoinModule.networkKoinModule
    )

    val koinModules = listOf(
        HomeUIKoinModule.homeUIKoinModule,
        HomeDomainKoinModule.homeDomainKoinModule
    )

}