package net.projecteuler.p48

import java.math.BigInteger

class SelfPowers {

    fun findLastTenDigits(value:Int) : String {
        val big = BigInteger(value.toString())
        println()
        val lastTenDigits = (selfPower(big) - BigInteger.ONE).toString()
        println("\nresult=$lastTenDigits")
        return lastTenDigits.takeLast(10)
    }

    private fun selfPower(value:BigInteger) : BigInteger {
        if (value <= BigInteger.ZERO) return BigInteger.ONE
        print("$value.pow($value) + ")
        return value.pow(value.toInt()) + selfPower(value.dec())
    }

}