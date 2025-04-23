package Lesson_2

fun main () {

    val departureHour = 9
    val departureMin = 39
    val travelTimeMin = 457

    val totalDepartureMin = departureHour * 60  + departureMin
    val trainArrivalMin = totalDepartureMin + travelTimeMin


    val arrivalHour = trainArrivalMin / 60
    val arrivalMin = trainArrivalMin % 60
    println("Время прибытия поезда : $arrivalHour:$arrivalMin")

}