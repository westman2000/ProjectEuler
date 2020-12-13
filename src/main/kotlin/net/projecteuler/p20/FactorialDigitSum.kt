package net.projecteuler.p20

import java.math.BigInteger
import kotlin.math.max

class FactorialDigitSum {


    fun findSumOfDigitsIn(value:BigInteger) : BigInteger {
        println("findSumOfDigitsIn($value)")
        val result = findSumOfDigitsInInternal(value)

        print("$result = [")
        var sum = BigInteger.ZERO
        result.toString().forEach {
            sum += BigInteger(it.toString())
            print("$it($sum) ")
        }
        println("]")

        return sum
    }

    @Suppress("NO_TAIL_CALLS_FOUND", "NON_TAIL_RECURSIVE_CALL")
    tailrec fun findSumOfDigitsInInternal(n:BigInteger) : BigInteger {
        return if (n == BigInteger.ZERO)
            BigInteger.ONE
        else
            n * findSumOfDigitsInInternal(n.dec())
    }


    fun findSumOfDigitsInHalf(n:BigInteger) : BigInteger {
        println("findSumOfDigitsInHalf($n)")

        val pair = n.divideAndRemainder(BigInteger("2"))

        val first = pair.first()
        val second = if (pair.isNotEmpty()) pair.first() + pair[1] else pair.first()

        return findSumOfDigitsInHalfInternal(
            n,
            first,
            second
        )
   }

    fun findSumOfDigitsInHalfInternal(n:BigInteger, down : BigInteger, up : BigInteger) : BigInteger {
        println("findSumOfDigitsInHalfInternal($n, $down, $up)")

//        val newUp = if (up >= n) BigInteger.ONE else up

        return if (down + up > BigInteger.TWO)   {
            return BigInteger.ONE
        }
        else
            down * up * findSumOfDigitsInHalfInternal(
                n,
                if (down.dec() <= BigInteger.ZERO) BigInteger.ONE else down.dec(),
                if (up.inc() > n) BigInteger.ONE else up.inc()
            )

    }

}