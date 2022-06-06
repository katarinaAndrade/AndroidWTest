package com.kat.core.data.data.storage

import com.kat.core.data.data.model.PostalCode

interface DBEngine {

    suspend fun insert(list: List<PostalCode>)

    suspend fun getPostCodes(input: String): List<PostalCode>

}