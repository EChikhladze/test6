package com.example.test6.data

import com.example.test6.domain.PasscodeRepository

class PasscodeRepositoryImpl : PasscodeRepository {

    override fun isCorrectPasscode(inputPasscode: String, correctPasscode: String): Boolean {
        return inputPasscode == correctPasscode
    }
}