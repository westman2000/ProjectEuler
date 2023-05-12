package net.projecteuler.p17


/**
 1 - one
 2 - two
 3 - three
 4 - four
 5 - five
 6 - six
 7 - seven
 8 - eight
 9 - nine
 10 - ten
 11 - eleven
 12 - twelve
 13 - thirteen
 14 - fourteen
 15 - fifteen
 16 - sixteen
 17 - seventeen
 18 - eighteen
 19 - nineteen
 20 - twenty
 30 - thirty
 40 - forty
 50 - fifty
 60 - sixty
 70 - seventy
 80 - eighty
 90 - ninety
 100 - hundred
 ...
 1000 one

*/
object NumberLetterCounts {

    private val ones = mapOf(
        1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five",
        6 to "six", 7 to "seven", 8 to "eight", 9 to "nine"
    )

    private val tens = mapOf(
        10 to "ten", 20 to "twenty", 30 to "thirty", 40 to "forty",
        50 to "fifty", 60 to "sixty", 70 to "seventy", 80 to "eighty", 90 to "ninety"
    )

    private val teens = mapOf(
        11 to "eleven", 12 to "twelve", 13 to "thirteen", 14 to "fourteen",
        15 to "fifteen", 16 to "sixteen", 17 to "seventeen", 18 to "eighteen", 19 to "nineteen"
    )

    private fun numberToWords(number: Int): String {
        if (number == 1000) return "onethousand"
        if (number == 0) return ""

        var result = ""

        if (number >= 100) {
            val hundred = number / 100
            result += "${ones[hundred]}hundred"
            if (number % 100 != 0) {
                result += "and"
            }
        }

        val remainder = number % 100
        if (remainder in 11..19) {
            result += teens[remainder]
        } else {
            if (remainder >= 10) {
                result += tens[remainder - remainder % 10]
            }
            if (remainder % 10 != 0) {
                result += ones[remainder % 10]
            }
        }

        return result
    }

    fun getNumberLetterCounts() : Int {
        var letterCount = 0

        for (i in 1..1000) {
            letterCount += numberToWords(i).length
        }

        println("Total number of letters from 1 to 1000: $letterCount")

        return letterCount
    }
}