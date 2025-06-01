package Lesson_4

const val SUNNY_WEATHER: String = "солнечная"
const val IS_AWNING_OPEN: Boolean = true
const val AIR_HUMIDITY: Int = 20
const val SEASON_WINTER: String = "зима"

fun main() {


    val weatherToday: String = "солнечная"
    val tentOpen: Boolean = true
    val humidity: Int = 20
    val currentSeason: String = "зима"
    val isSunny = weatherToday == SUNNY_WEATHER
    val isTentOpen = tentOpen == IS_AWNING_OPEN
    val humidityOptimal = humidity == AIR_HUMIDITY
    val isNotWinter = currentSeason != SEASON_WINTER

    val favorableConditions = isSunny && isTentOpen && humidityOptimal && isNotWinter

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")


}