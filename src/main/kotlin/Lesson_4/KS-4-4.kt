package Lesson_4.Lesson_4

fun main() {

    val startDay = 1
    val currentDay = 5

    val dayPassed = currentDay - startDay
    val exercisesForHandAndAbs = (dayPassed % 2 == 0)
    val exercisesForLegsAndBack = !exercisesForHandAndAbs

    println(
        "Упражнение для рук: ${exercisesForHandAndAbs}\n" +
                "Упражнения для ног: ${exercisesForLegsAndBack}\n" +
                "Упражнения для спины: ${exercisesForLegsAndBack}\n" +
                "Упражнения для пресса: ${exercisesForHandAndAbs}"
    )
}