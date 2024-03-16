package com.example.unittestingguide.problems

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class ValidatePasswordTest {
    lateinit var validatePassword: ValidatePassword

    @Before
    fun setUp(){
        validatePassword= ValidatePassword()
    }

    @Test
    fun validatePassword() {
        val result =validatePassword.validatePassword("")
        assertEquals("Password is empty", result)
    }

    @Test
    fun validate_password_short_Length() {
        val result =validatePassword.validatePassword("eururr")
        assertEquals("Password length should be between 6 to 15", result)
    }

    @Test
    fun validate_password_long_Length() {
        val result =validatePassword.validatePassword("wewewewewewewewtretetereweetetet")
        assertEquals("Password length should be between 6 to 15", result)
    }

    @Test
    fun validate_correct_password() {
        val result =validatePassword.validatePassword("Valid123")
        assertEquals("valid password", result)
    }

}