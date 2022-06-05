package com.kat.app.domain.data.repository

import com.kat.app.domain.data.datasource.AppDataSource

class AppRepository(
    private val dataSource: AppDataSource
) {

    suspend fun downloadPostalCodes() {
        dataSource.downloadPostalCodes()
    }

}