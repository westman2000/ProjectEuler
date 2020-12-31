package net.projecteuler.p25

import java.math.BigInteger

class Fibonacci1000Digit {

    //What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
    fun findIndexForNumberWithDigits(numDigits : Int) : Int {

        var prevPrev = BigInteger.ONE
        var prev = BigInteger.ONE
        var current: BigInteger
        var index = 3


        while(true) {
            current = prev + prevPrev

            println("Fibonacci number $current at index $index")

            if (current.toString().length == numDigits) return index

            index++
            prevPrev = prev
            prev = current

        }
    }

}