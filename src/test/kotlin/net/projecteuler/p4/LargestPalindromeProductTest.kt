package net.projecteuler.p4

import org.junit.Assert
import org.junit.Test
import kotlin.system.measureTimeMillis


class LargestPalindromeProductTest {

    @Test
    fun checkReverse() {
        val underTest = LargestPalindromeProduct()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                901109,
                underTest.reverseNumber(901109)
            )
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }

    @Test
    fun checkIsPalindrome() {
        val underTest = LargestPalindromeProduct()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertTrue(underTest.isPalindrome(901109))
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }

    @Test
    fun checkLargest() {
        val underTest = LargestPalindromeProduct()

        val timeToFindInMillisecond = measureTimeMillis {
            underTest.findLargestPalindromeProduct()
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }

}