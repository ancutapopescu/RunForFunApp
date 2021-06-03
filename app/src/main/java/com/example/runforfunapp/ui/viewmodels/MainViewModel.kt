package com.example.runforfunapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.runforfunapp.db.Run
import com.example.runforfunapp.repositories.MainRepository
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
) : ViewModel() {

    fun insertRun(run: Run) = viewModelScope.launch {
        mainRepository.insertRun(run)
    }
}