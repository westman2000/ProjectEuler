import java.math.BigInteger

object Fibonacci {

    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
    fun findSumOfEvenTerms(spot:BigInteger, first: BigInteger, second:BigInteger, sum : BigInteger) : BigInteger {
        println("findSumOfEvenTerms($spot, $first, $second, $sum) ${second.mod(BigInteger.TWO)}")

        if (spot < BigInteger.ONE) return BigInteger.ZERO
        if (second >= BigInteger("4000000")) return BigInteger.ZERO

        var internalSum = sum
        if (second.mod(BigInteger.TWO) == BigInteger.ZERO) {
            internalSum += second
        }

        return findSumOfEvenTerms(spot - BigInteger.ONE, second, first + second, internalSum)
    }

}