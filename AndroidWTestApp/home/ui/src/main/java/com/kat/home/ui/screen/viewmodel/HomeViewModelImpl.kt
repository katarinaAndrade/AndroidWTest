package com.kat.home.ui.screen.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.kat.core.data.data.model.PostalCode
import com.kat.home.domain.data.usecase.HomeUseCase
import kotlinx.coroutines.launch

class HomeViewModelImpl(
    private val useCase: HomeUseCase
): HomeViewModel() {

    override val listPostalCode = MutableLiveData<List<PostalCode>>()

    override fun getPostCodes(input: String) {
        viewModelScope.launch {
            try {
                val result = useCase.getPostCodes(input)
                listPostalCode.value = result
            } catch (e: Exception) {
                Log.d(HomeViewModelImpl::class.simpleName, e.toString())
            }
        }
    }

}