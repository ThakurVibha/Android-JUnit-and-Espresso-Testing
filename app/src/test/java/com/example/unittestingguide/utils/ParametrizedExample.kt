package com.example.unittestingguide.utils

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class ParametrizedExample(val input1: Int, val input2: Int, val expectedResult: Int) {
    @Test
    fun test() {
        val helper = Helper()
        val result = helper.addTwoNumbers(input1, input2)
        assertEquals(expectedResult, result)
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters(name = "{0} addition - {1}")
        fun dataToCheck(): List<Array<Any>> {
            return listOf(
                arrayOf(5, 5, 10), arrayOf(2, 3, 5), arrayOf(33, 2, 35), arrayOf(5, 5, 10)
            )
        }
    }


}