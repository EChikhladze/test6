package com.example.test6.domain

interface PasscodeRepository {
    fun isCorrectPasscode(inputPasscode: String, correctPasscode: String): Boolean
}