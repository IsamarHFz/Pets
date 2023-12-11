package com.example.pets.ui

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.pets.data.UserDataUiEvents
import com.example.pets.data.UserInputScreenState


class UserInputViewModel : ViewModel(){

    companion object{
        const val TAG = "UserInputViewModel"
    }
    var uiState = mutableStateOf(UserInputScreenState())

    fun onEvent(event: UserDataUiEvents) {
        when(event){
            is UserDataUiEvents.UserNameEntered -> {
                uiState.value = uiState.value.copy(
                    nameEntered = event.name
                )
                Log.d(TAG, "OnEvent:UserNameEntered->> ")
                Log.d(TAG, "${uiState.value}")
            }

            is UserDataUiEvents.AnimalSelected -> {
                uiState.value = uiState.value.copy(
                    animalSelected = event.animalValue
                )
                Log.d(TAG, "OnEvent:AnimalSelected->> ")
                Log.d(TAG, "${uiState.value}")
            }
        }
    }

    fun isValidState() :Boolean{
        return !uiState.value.nameEntered.isNullOrEmpty() && !uiState.value.animalSelected.isNullOrEmpty()

    }
}