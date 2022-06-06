package com.kat.home.domain.data.repository

import com.kat.core.data.data.model.PostalCode
import com.kat.home.domain.data.datasource.HomeDataSource

class HomeRepository(
    private val dataSource: HomeDataSource
) {

    suspend fun getPostCodes(input: String): List<PostalCode> = dataSource.getPostCodes(input)

}