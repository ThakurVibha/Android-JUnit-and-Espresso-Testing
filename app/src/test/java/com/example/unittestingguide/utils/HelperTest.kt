package com.example.unittestingguide.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {
    //Arrange

    lateinit var helper: Helper

    @Before
    fun setUp(){
        helper=Helper()
        println("Run Before any test case")
    }

    @After
    fun setUpAfter(){
        println("Run After any test case")
    }


    @Test
    fun addTwoNumbers() {
        //Act
        val result= helper.addTwoNumbers(2,7)
        //Assert
        assertEquals(9, result)


    }

    @Test
    fun addTwoNumbersFailed() {
        //Arrange
        val helper=Helper()
        //Act
        val result= helper.addTwoNumbers(7,7)
        //Assert
        assertEquals(14, result)


    }
}