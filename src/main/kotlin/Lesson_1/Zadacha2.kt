package Lesson_1

fun main() {

   val numberOfOrders = 75
   val thanksForYourOrder = "Спасибо за Ваш заказ.Ждем Вас снова!"
   var totalEmployees = 2000

   println("Заказов сегодня : $numberOfOrders")
   println(thanksForYourOrder)
   println("Общее колличество работников : $totalEmployees")

   totalEmployees -= 1
   println("Общее колличество работников после увольнения : $totalEmployees")
}