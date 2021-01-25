package net.projecteuler.p10

import org.junit.Assert
import org.junit.Test
import kotlin.system.measureTimeMillis


internal class SumOfPrimesTest {

    @Test
    fun find() {
        val underTest = SumOfPrimes()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                10,
                underTest.find())
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }
}