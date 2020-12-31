package net.projecteuler.p25

import org.junit.Assert
import org.junit.Test
import kotlin.system.measureTimeMillis

class Fibonacci1000DigitTest {

    @Test
    fun find1000Digit() {
        val underTest = Fibonacci1000Digit()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                4782,
                underTest.findIndexForNumberWithDigits(1000)
            )
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }

    @Test
    fun findThreeDigit() {
        val underTest = Fibonacci1000Digit()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                12,
                underTest.findIndexForNumberWithDigits(3)
            )
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }
}