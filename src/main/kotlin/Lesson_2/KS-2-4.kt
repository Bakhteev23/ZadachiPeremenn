package Lesson_2

fun main () {

    val minedCrystalOres = 7
    val minedIronOre = 11
    val percentageBaffInt = 20

    val percentageBaff = percentageBaffInt / 100.00

    val bonusCrystal: Int = (minedCrystalOres * percentageBaff).toInt()
    val bonusIron: Int = (minedIronOre * percentageBaff).toInt()

    println("Бонусные кристаллы: $bonusCrystal")
    println("Бонусная железная руда: $bonusIron")
}