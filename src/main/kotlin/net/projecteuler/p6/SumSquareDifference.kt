package net.projecteuler.p6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.math.BigInteger


class SumSquareDifference {

    fun findSumOfSquares(bum:Int) : Int {
        return sumOfSquares(bum, 0, 0)
    }

    private fun sumOfSquares(n:Int, sq:Int, num:Int) : Int {
        if (n == 0)  {
            println("sumOfSquares($n, $sq, $num)")
            return num * num - sq
        }
        val newSq = sq + n*n
        val newNum = num + n

        return sumOfSquares(n-1, newSq, newNum)
    }

    suspend fun sumOfSquaresLoop(n:BigInteger)  = withContext(Dispatchers.IO){

        var sq = BigInteger.ZERO
        var num = BigInteger.ZERO
        var i = BigInteger.ZERO
        while (i <= n) {
            sq = sq + i.pow(2)
            num = num + i
            i = i + BigInteger.ONE
        }

        val a = num.pow(2)
        val b = a.minus(sq)
        println("$a - $sq = $b")

    }
}