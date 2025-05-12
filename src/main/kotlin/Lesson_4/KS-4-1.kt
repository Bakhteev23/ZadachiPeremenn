package Lesson_4

fun main() {

    val totalTables = 13
    val bookedToday = totalTables
    val bookedTomorrow = 9
    val availableToday = bookedToday < totalTables
    val availableTomorrow = bookedTomorrow < totalTables

    println("Доступность столов на сегодня: $availableToday")
    println("Доступность столов на завтра: $availableTomorrow")
}