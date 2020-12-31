package net.projecteuler.p4

class LargestPalindromeProduct {

    fun reverseNumber(number:Int) : Int {

        var revNumber = 0
        var num = number

        while (num > 0) {
            revNumber = revNumber * 10 + num % 10
            num /= 10
        }

        return revNumber
    }

    fun isPalindrome(number : Int) : Boolean {
        if ((number xor reverseNumber(number)) == 0) return true
        return false
    }

    fun findLargestPalindromeProduct() {

        var maxNumber = 0

        for (i in 100..999) {
            for (j in 100..999) {
                if (isPalindrome(i*j)) {

                    if (i*j > maxNumber) maxNumber = i*j

                    println("$i * $j = ${i*j}, max = $maxNumber")
                }
            }
        }
    }
}