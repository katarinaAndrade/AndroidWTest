package com.kat.androidwtest.screen.viewmodel

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.kat.app.domain.data.usecase.AppUseCase
import kotlinx.coroutines.launch

class SplashViewModelImpl(
    private val useCase: AppUseCase
): SplashViewModel() {

    override fun downloadPostalCodes() {
        viewModelScope.launch {
            try {
                useCase.downloadPostalCodes()
            } catch (e: Exception) {
                Log.d(SplashViewModelImpl::class.simpleName, e.toString())
            }
        }
    }

}