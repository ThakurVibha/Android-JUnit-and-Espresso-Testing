package com.example.unittestingguide.problems

class ValidatePassword {
    fun validatePassword(passwordValue: String): Boolean {
        if(passwordValue.isEmpty()){
            return false
        }else if(passwordValue.length!in 6..15){
            return false
        }
        return true
    }
}