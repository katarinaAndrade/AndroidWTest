package com.kat.app.domain.data.usecase

import com.kat.app.domain.data.repository.AppRepository

class AppUseCaseImpl(
    private val repository: AppRepository
): AppUseCase {

    override suspend fun downloadPostalCodes() {
        repository.downloadPostalCodes()
    }

}