package net.projecteuler.p13

import org.junit.Assert
import org.junit.Test
import kotlin.system.measureTimeMillis

class LargeSumTest  {

    @Test
    fun findLastTenDigitsTest() {
        val underTest = LargeSum()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                "0405071317",
                underTest.findSum())
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }

}