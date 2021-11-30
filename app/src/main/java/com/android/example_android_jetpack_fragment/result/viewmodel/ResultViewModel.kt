package com.android.example_android_jetpack_fragment.result.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ResultViewModel : ViewModel() {

    val resultLiveData = MutableLiveData<String>()

}