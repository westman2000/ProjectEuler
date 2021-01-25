package net.projecteuler.p9

class Triplet {

    fun find() {
        for (a in 0..999) for (b in a + 1..999) for (c in b + 1..999) {
            if ((a * a + b * b == c * c) && (a+b+c==1000) ) {
                println("$a+$b=$c")
                println("$a+$b+$c=1000")
                println("$a*$b*$c=${a*b*c}")
            }
        }
    }

}