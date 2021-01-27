package net.projecteuler.p21

import org.junit.Assert
import org.junit.Test
import kotlin.system.measureTimeMillis

class AmicableNumbersTest {

    @Test
    fun t1() {
        val underTest = AmicableNumbers()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                284,
                underTest.divisorsSum(220))
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }

    @Test
    fun t2() {
        val underTest = AmicableNumbers()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                220,
                underTest.divisorsSum(284))
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }
}