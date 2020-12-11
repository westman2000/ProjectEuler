package net.projecteuler.p16

import java.math.BigInteger

class PowerDigitSum {

    fun getSumOfDigits(num:Int, pow:Int) : Int {

        val value = BigInteger(num.toString())

        var sum = 0
        print("[")
        value.pow(pow).toString().forEach {
            sum += Integer.parseInt(it.toString())
            print("$it($sum) ")
        }
        print("]")

        return sum
    }
}