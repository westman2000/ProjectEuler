package net.projecteuler.p5


/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
// first version - bruteforce
class SmallestMultiple {

    fun findSmallestNumber(progression:IntProgression) : Int {

        // check if range start > 0
        if (progression.first < 0) return 0

        var searchedValue : Int = 1

        while (!isValueDividableByProgression(searchedValue, progression)) {
            searchedValue++
        }

        return searchedValue
    }

    private fun isValueDividableByProgression(value:Int, progression: IntProgression) : Boolean {
        progression.forEach {
            if (value % it != 0)  {
                return false
            }
        }
        println("Value $value Dividable By $progression")
        return true
    }

    // TODO-  threads/coroutines? threads count equal progression
}