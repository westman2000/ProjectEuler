package net.projecteuler.p15

import org.junit.Assert
import org.junit.Test
import kotlin.system.measureTimeMillis

class LatticePathsTest {

    @Test
    fun howManyRoutesTest() {
        val underTest = LatticePaths()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                6,
                underTest.howManyRoutes(2,2))
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }


    @Test
    fun howManyRoutesTest02() {
        val underTest = LatticePaths()

        val timeToFindInMillisecond = measureTimeMillis {
            Assert.assertEquals(
                407575348,
                underTest.howManyRoutes(20,20))
        }
        println("\n---------\nTime to find is $timeToFindInMillisecond\n-----------\n")
    }
}