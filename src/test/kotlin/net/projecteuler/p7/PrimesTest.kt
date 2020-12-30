package net.projecteuler.p7

import org.junit.Assert
import org.junit.Test
import kotlin.system.measureTimeMillis

class PrimesTest {

    @Test
    fun findLastTenDigitsTest() {
        val underTest = Primes()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                104743,
                underTest.findPrime(10001))
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }

}