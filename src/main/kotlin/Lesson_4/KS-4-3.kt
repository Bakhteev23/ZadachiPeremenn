package Lesson_4

fun main() {

    val weatherToday: String = "солнечная"
    val tentOpen: Boolean = true
    val airHumidity: Int = 20
    val currentSeason: String = "зима"

    val result = (weatherToday == "солнечная") &&
            (tentOpen) &&
            (airHumidity == 20) &&
            (currentSeason != "зима")
    println("Благоприятные ли условия сейчас для роста бобовых? $result")


}