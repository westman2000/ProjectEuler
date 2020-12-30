package net.projecteuler.p15

class LatticePaths {

    val map = mutableMapOf<String,Int>()

    fun howManyRoutes(n: Int, m : Int) : Int {
        println("$n,$m")
        val key = "$n,$m"
        if (map.containsKey(key)) return map[key]!!
        if (n == 0) return m
        if (m == 0) return n
        if (n == 1 && m == 1) return 2
        map[key] = howManyRoutes(n-1, m) + howManyRoutes(n ,m-1)
        return map[key]!!
    }

}