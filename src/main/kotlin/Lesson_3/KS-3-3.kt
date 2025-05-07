package Lesson_3

fun main() {

    val number = 6
    val multiplicationTable = (1..9).joinToString("\n") { "$number x $it = ${number * it}" }

    println(multiplicationTable)

}