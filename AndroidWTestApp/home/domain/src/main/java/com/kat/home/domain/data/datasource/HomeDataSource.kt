package com.kat.home.domain.data.datasource

import com.kat.core.data.data.model.PostalCode
import com.kat.core.data.data.storage.DBEngine

class HomeDataSource(
    private val db: DBEngine
) {

    suspend fun getPostCodes(input: String): List<PostalCode> = db.getPostCodes(input)

}