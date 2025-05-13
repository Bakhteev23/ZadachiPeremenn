package Lesson_4

const val TOTAL_TABLES = 13
fun main() {


    val bookedToday = TOTAL_TABLES
    val bookedTomorrow = 9
    val availableToday = bookedToday < TOTAL_TABLES
    val availableTomorrow = bookedTomorrow < TOTAL_TABLES

    println("Доступность столиков на сегодня: $availableToday")
    println("Доступность столиков на завтра: $availableTomorrow")
}