package net.projecteuler.p14

object LongestCollatzSequence {

    fun getLongestCollatzSequence() {
        val limit = 1_000_000
        println(longestCollatzSequence(limit))
    }

    private fun collatzSequenceLength(n: Long): Int {
        var count = 1
        var value = n
        while (value != 1L) {
            count++
            value = if (value % 2 == 0L) value / 2 else 3 * value + 1
        }
        return count
    }

    private fun longestCollatzSequence(limit: Int): Long {
        var maxLength = 0
        var number = 0L
        for (i in 2 until limit) {
            val length = collatzSequenceLength(i.toLong())
            if (length > maxLength) {
                maxLength = length
                number = i.toLong()
            }
        }
        return number
    }

}