package net.projecteuler.p21

import java.util.*

class AmicableNumbers {

    // TODO - not finished!

    fun divisorsSum(n: Int) : Int {
        val s = Stack<Int>()
        var sum = 0
        for (i in 1 until n) {
            if (n%i==0) sum += i
        }
        return sum
    }

}