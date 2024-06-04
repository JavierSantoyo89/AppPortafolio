package dev.javiersantoyo.appportafolio.calculadora.components

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorKeyboardViewModel() : ViewModel() {
    fun isCounter(total: Int) {

    }

    private val _dataNum = MutableLiveData<Int>()
    val dataNum: LiveData<Int> = _dataNum

    private val _dataNum2 = MutableLiveData<Int>()
    val dataNum2: LiveData<Int> = _dataNum2

    private val _subTotal = MutableLiveData<Int>()
    val subTotal: LiveData<Int> = _subTotal

    private var _total = MutableLiveData<Int>()
    var total: LiveData<Int> = _total

    

//    fun isCounter() {
//        total +1
//        println("el total es: $total")
//    }

}

