package com.kat.home.ui.di

import com.kat.home.ui.screen.viewmodel.HomeViewModel
import com.kat.home.ui.screen.viewmodel.HomeViewModelImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object HomeUIKoinModule {

    val homeUIKoinModule = module {
        viewModel<HomeViewModel> {
            HomeViewModelImpl(get())
        }
    }

}