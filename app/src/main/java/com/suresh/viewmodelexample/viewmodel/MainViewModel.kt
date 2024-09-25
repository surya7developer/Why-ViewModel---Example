package com.suresh.viewmodelexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var count: Int = 1

    private var _number = MutableLiveData(1)
    private val number: LiveData<Int> = _number

    fun increment() {
        count++
        _number.postValue(count)
    }

    fun getNumber() = number


    fun clearData() {
        count = 0
        _number.postValue(count)
    }

}