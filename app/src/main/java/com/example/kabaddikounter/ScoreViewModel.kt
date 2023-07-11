package com.example.kabaddikounter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {
    var scoreA: Int = 0

    private val _scoreB = MutableLiveData<Int>(0)
    val scoreB: LiveData<Int>
        get() = _scoreB

    fun incrementA(isTeamA: Boolean,step:Int) {
        if (isTeamA) scoreA+=step
        else _scoreB.value = scoreB.value!!+step
    }
}