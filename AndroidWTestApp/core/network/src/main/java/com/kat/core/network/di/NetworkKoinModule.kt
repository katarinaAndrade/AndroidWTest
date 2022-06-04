package com.kat.core.network.di

import com.kat.core.network.network.NetworkApi
import com.kat.core.network.network.NetworkEngine
import com.kat.core.network.network.connection.CheckNetworkConnection
import org.koin.dsl.module

object NetworkKoinModule {

    val networkKoinModule = module {
        single {
            CheckNetworkConnection(get(), get())
        }
        single<NetworkEngine> {
            NetworkApi(get(), get())
        }
    }

}