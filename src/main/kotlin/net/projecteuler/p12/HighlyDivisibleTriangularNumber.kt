package net.projecteuler.p12

object HighlyDivisibleTriangularNumber {

    fun getHighlyDivisibleTriangularNumber() {
        var n = 1
        var triangleNumber = 0

        while (true) {
            // Вычисляем текущее треугольное число
            triangleNumber += n
            // Находим простые множители треугольного числа
            val factors = primeFactors(triangleNumber)
            // Вычисляем количество делителей
            val divisors = divisorsCount(factors)

            // Если количество делителей больше 500, прерываем цикл
            if (divisors > 500) {
                break
            }

            n++
        }

        println(triangleNumber)
    }

    // Функция для определения количества делителей, используя простые множители
    private fun divisorsCount(factors: Map<Int, Int>): Int {
        println("divisorCount($factors)")
        if (factors.isEmpty()) return 0
        return factors.values.map { it + 1 }.reduce { a, b -> a * b }
    }

    // Функция для определения простых множителей числа n
    private fun primeFactors(n: Int): Map<Int, Int> {
        println("primeFactors($n)")

        var num = n
        val factors = mutableMapOf<Int, Int>()

        // Начинаем с самого маленького простого числа - 2
        var i = 2
        // Продолжаем цикл, пока квадрат текущего числа i меньше или равен num
        while (i * i <= num) {
            // Если num делится нацело на i, значит i - простой множитель числа num
            if (num % i == 0) {
                // Добавляем i в список простых множителей с подсчетом кратности
                factors.merge(i, 1, Int::plus)
                // Делим num на i, чтобы упростить дальнейший поиск множителей
                num /= i
            } else {
                // Если num не делится нацело на i, переходим к следующему числу
                i++
            }
        }

        // Если после цикла num больше 1, значит num - последний простой множитель числа n
        if (num > 1) {
            factors.merge(num, 1, Int::plus)
        }

        // Возвращаем список простых множителей числа n с их кратностями
        return factors
    }
}