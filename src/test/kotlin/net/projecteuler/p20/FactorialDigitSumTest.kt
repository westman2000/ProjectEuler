package net.projecteuler.p20

import org.junit.Assert
import org.junit.Test
import java.math.BigInteger
import java.util.*
import kotlin.system.measureTimeMillis

class FactorialDigitSumTest {

    @Test
    fun findSumOfDigitsInTest() {
        val underTest = FactorialDigitSum()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                (BigInteger.TWO.pow(2)+ BigInteger.ONE).pow(2) + BigInteger.TWO,
                underTest.findSumOfDigitsIn(BigInteger.TEN))
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }

    @Test
    fun findSumOfDigitsInTest02() {
        val underTest = FactorialDigitSum()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                BigInteger("648"),
                underTest.findSumOfDigitsIn(BigInteger.TEN.pow(2)))
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }

    @Test
    fun findSumOfDigitsInTest03() {
        val underTest = FactorialDigitSum()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                BigInteger("10539"),
                underTest.findSumOfDigitsIn(BigInteger.TEN.pow(3)))
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }

    @Test
    fun findSumOfDigitsInTest04() {
        val underTest = FactorialDigitSum()


        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                BigInteger("10539"),
                underTest.findSumOfDigitsInHalf(BigInteger("5"))
            )
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }
}