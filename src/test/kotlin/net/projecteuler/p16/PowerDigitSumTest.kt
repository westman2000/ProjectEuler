package net.projecteuler.p16

import org.junit.Assert.*

import org.junit.Test
import kotlin.system.measureTimeMillis

class PowerDigitSumTest {

    @Test
    fun testDigitSum() {

        val underTest = PowerDigitSum()

        val timeToFindInMillisecond = measureTimeMillis {
            assertEquals(26, underTest.getSumOfDigits(2, 15))
        }
        println("\nTime to find is $timeToFindInMillisecond")
    }

    @Test
    fun testDigitSum02() {

        val underTest = PowerDigitSum()

        val timeToFindInMillisecond = measureTimeMillis {
            assertEquals(1366, underTest.getSumOfDigits(2, 1000))
        }
        println("\nTime to find is $timeToFindInMillisecond")
    }

}