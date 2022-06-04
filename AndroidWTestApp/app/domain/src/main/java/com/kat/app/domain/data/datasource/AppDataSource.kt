package com.kat.app.domain.data.datasource

import com.kat.core.network.network.NetworkEngine

class AppDataSource(
    private val networkEngine: NetworkEngine
) {

    suspend fun downloadPostalCodes() {
        networkEngine.getPostalCode()
    }

}