package net.projecteuler.p48

import org.junit.Assert
import org.junit.Test
import kotlin.system.measureTimeMillis

class SelfPowersTest {

    @Test
    fun findLastTenDigitsTest() {
        val underTest = SelfPowers()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                "0405071317",
                underTest.findLastTenDigits(10))
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }

    @Test
    fun findLastTenDigitsTest02() {
        val underTest = SelfPowers()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                "9110846700",
                underTest.findLastTenDigits(1000))
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }

    @Test
    fun findLastTenDigitsTest03() {
        val underTest = SelfPowers()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                "9110846700",
                underTest.findLastTenDigits(10000))
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }
}