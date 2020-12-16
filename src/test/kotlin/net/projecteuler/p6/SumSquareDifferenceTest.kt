package net.projecteuler.p6

import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test
import java.math.BigInteger
import kotlin.system.measureTimeMillis

class SumSquareDifferenceTest {

    val underTest = SumSquareDifference()


    @Test
    fun differenceTest() {
        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                2640,
                underTest.findSumOfSquares(10))
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }

    @Test
    fun differenceTest02() {
        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                25164150,
                underTest.findSumOfSquares(100))
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }

    @Test
    fun differenceTest03()  = runBlocking {
        underTest.sumOfSquaresLoop(BigInteger.TEN)
        underTest.sumOfSquaresLoop(BigInteger.TEN * BigInteger.TEN)
        underTest.sumOfSquaresLoop(BigInteger.TEN * BigInteger.TEN * BigInteger.TEN)
        underTest.sumOfSquaresLoop(BigInteger.TEN * BigInteger.TEN * BigInteger.TEN * BigInteger.TEN)
        underTest.sumOfSquaresLoop(BigInteger.TEN * BigInteger.TEN * BigInteger.TEN * BigInteger.TEN * BigInteger.TEN)
        underTest.sumOfSquaresLoop(BigInteger.TEN * BigInteger.TEN * BigInteger.TEN * BigInteger.TEN * BigInteger.TEN * BigInteger.TEN)
        underTest.sumOfSquaresLoop(BigInteger.TEN * BigInteger.TEN * BigInteger.TEN * BigInteger.TEN * BigInteger.TEN * BigInteger.TEN * BigInteger.TEN)
    }
}