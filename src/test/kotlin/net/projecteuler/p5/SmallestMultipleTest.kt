package net.projecteuler.p5

import org.junit.Test

import org.junit.Assert.*
import kotlin.system.measureTimeMillis

class SmallestMultipleTest {

    @Test
    fun findSmallestFor1to10Progression() {

        val underTest = SmallestMultiple()

        var value = 0
        val progression = 1..10
        val timeToFindInMillisecond = measureTimeMillis {
            value = underTest.findSmallestNumber(progression)
        }
        println("Time to find smallest for progression [$progression] is $timeToFindInMillisecond")

        assertEquals(2520, value)
    }

    @Test
    fun findSmallestFor1to20Progression() {

        val underTest = SmallestMultiple()

        var value = 0
        val progression = 1..20
        val timeToFindInMillisecond = measureTimeMillis {
            value = underTest.findSmallestNumber(progression)
        }
        println("Time to find smallest for progression [$progression] is $timeToFindInMillisecond")

        assertEquals(232792560, value)
    }

    // TODO - test execution time < 1 sec
}