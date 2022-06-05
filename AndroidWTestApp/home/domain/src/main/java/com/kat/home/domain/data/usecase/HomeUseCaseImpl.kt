package com.kat.home.domain.data.usecase

import com.kat.core.data.data.model.PostalCode
import com.kat.home.domain.data.repository.HomeRepository

class HomeUseCaseImpl(
    private val repository: HomeRepository
): HomeUseCase {

    override suspend fun getPostCodes(input: String): List<PostalCode> = repository.getPostCodes(input)

}