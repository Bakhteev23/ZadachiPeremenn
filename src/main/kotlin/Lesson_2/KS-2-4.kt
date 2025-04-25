package Lesson_2

fun main () {

    val minedCrystalOres: Int = 7
    val minedIronOre: Int = 11
    val percentageBaff: Double = 0.20
    
    val bonusCrystal : Int = (minedCrystalOres * percentageBaff).toInt()
    val bonusIron : Int = (minedIronOre * percentageBaff).toInt()

    println("Бонусные кристаллы: $bonusCrystal")
    println("Бонусная железная руда: $bonusIron")



}