package com.kat.home.domain.data.usecase

import com.kat.core.data.data.model.PostalCode

interface HomeUseCase {

    suspend fun getPostCodes(input: String): List<PostalCode>

}