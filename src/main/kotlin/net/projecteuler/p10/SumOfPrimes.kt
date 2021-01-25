package net.projecteuler.p10

import java.math.BigInteger

class SumOfPrimes {

    private fun isPrime(value:Int) : Boolean {
        if (value <= 1) return false
        for (i in 2 until value) {
            if (value % i == 0) return false
        }
        return true
    }

    fun findPrime(number:Int) : Int {
        var i = 2
        var primeNumber = 0

        while (primeNumber<number) {
            if (isPrime(i)) {
                primeNumber++
                println("prime #$primeNumber is $i")
            }
            i++
        }

        return i-1
    }

    fun find() : BigInteger {

        var sum : BigInteger = BigInteger.ZERO

        for (i in 1..2_000_000) {
            if (isPrime(i)) {
                sum = sum + BigInteger.valueOf(i.toLong())
                println("sum+$i:$sum")
            }
        }

        return sum
    }
}