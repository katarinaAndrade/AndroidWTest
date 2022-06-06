package com.kat.app.domain.di

import com.kat.app.domain.data.datasource.AppDataSource
import com.kat.app.domain.data.repository.AppRepository
import com.kat.app.domain.data.usecase.AppUseCase
import com.kat.app.domain.data.usecase.AppUseCaseImpl
import org.koin.dsl.module

object AppDomainKoinModule {

    val appDomainKoinModule = module {
        factory<AppUseCase> {
            AppUseCaseImpl(get())
        }
        factory {
            AppRepository(get())
        }
        factory {
            AppDataSource(get())
        }
    }

}