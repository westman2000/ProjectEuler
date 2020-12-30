package net.projecteuler.p7

class Primes {

    private fun isPrime(value:Int) : Boolean {

        if (value <= 1) return false

        for (i in 2 until value) {
//            println("$value % $i = ${value % 2}")
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
}