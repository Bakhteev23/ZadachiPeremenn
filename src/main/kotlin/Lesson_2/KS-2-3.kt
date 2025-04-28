package Lesson_2

fun main () {

    val departureHour = 9
    val departureMin = 39
    val travelTimeMin = 457
    val minutesInHour = 60

    val totalDepartureMin = departureHour * minutesInHour  + departureMin
    val trainArrivalMin = totalDepartureMin + travelTimeMin

    val arrivalHour = trainArrivalMin / minutesInHour
    val arrivalMin = trainArrivalMin % minutesInHour
    println("Время прибытия поезда : $arrivalHour:$arrivalMin")

}