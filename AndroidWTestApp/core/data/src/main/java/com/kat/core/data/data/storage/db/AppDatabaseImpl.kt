package com.kat.core.data.data.storage.db

import com.kat.core.data.data.model.PostalCode
import com.kat.core.data.data.storage.DBEngine

class AppDatabaseImpl(
    private val db: AppDatabase
): DBEngine {

    override suspend fun insert(list: List<PostalCode>) {
        list.forEach {
            db.storageDao().insert(it)
        }
    }

    override suspend fun getPostCodes(input: String): List<PostalCode> {
        TODO("Not yet implemented")
    }

}