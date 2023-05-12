package net.projecteuler.p19

import java.text.SimpleDateFormat
import java.util.*


object CountingSundays {

    fun getSundays() {
        val formatter = SimpleDateFormat("yyyy-MM-dd")
        val startDate: Date = formatter.parse("1901-01-01")
        val endDate: Date = formatter.parse("2000-12-31")

        println(generateRange(startDate, endDate))
    }

    fun generateRange(dateFrom: Date, dateTo: Date) : Int {
        val current = Calendar.getInstance()
        current.time = dateFrom

        var sundaysNum = 0

        while (!current.time.after(dateTo)) {

            val day: Int = current.get(Calendar.DAY_OF_WEEK)
            if (day == Calendar.SUNDAY)
                sundaysNum++

            current.add(Calendar.MONTH, 1)
        }

        return sundaysNum
    }
}