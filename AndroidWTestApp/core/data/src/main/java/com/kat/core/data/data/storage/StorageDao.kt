package com.kat.core.data.data.storage

import androidx.room.Insert
import com.kat.core.data.data.model.PostalCode

interface StorageDao {

    @Insert
    suspend fun insert(postalCode: PostalCode)

}