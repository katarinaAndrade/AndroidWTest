package com.kat.home.ui.screen.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kat.core.data.data.model.PostalCode

abstract class HomeViewModel: ViewModel() {

    abstract val listPostalCode: LiveData<List<PostalCode>>

    abstract fun getPostCodes(input: String)

}