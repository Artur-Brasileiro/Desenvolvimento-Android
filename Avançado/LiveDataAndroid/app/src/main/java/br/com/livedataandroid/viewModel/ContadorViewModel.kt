package br.com.livedataandroid.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContadorViewModel : ViewModel() {

    val contador : MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    fun addOne() {
        val value = contador.value ?: 0
        contador.value = (value + 1)
    }

}