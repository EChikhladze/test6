package com.example.test6.presentation

import androidx.lifecycle.ViewModel
import com.example.test6.domain.PasscodeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PasscodeFragmentViewModel @Inject constructor(private val passcodeRepository: PasscodeRepository) :
    ViewModel() {
    private val passcode = "0934"

    fun isCorrectPasscode(inputPasscode: String): Boolean {
        return passcodeRepository.isCorrectPasscode(inputPasscode, passcode)
    }
}