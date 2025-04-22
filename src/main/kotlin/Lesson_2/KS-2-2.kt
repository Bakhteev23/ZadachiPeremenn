package Lesson_2
fun main () {

    val numberOfWorkers = 50
    val workerSalary = 30000
    val traineers = 30
    val traineeSalary = 20000

    val salariesExpensesForWorkers = numberOfWorkers * workerSalary
    println (salariesExpensesForWorkers)

    val salariesExpensesForTraineers = traineers * traineeSalary
    println (salariesExpensesForTraineers)

    val totalSalariesExpenses = salariesExpensesForWorkers + salariesExpensesForTraineers
    println (totalSalariesExpenses)

    val middleSalaryPerEmployee = (totalSalariesExpenses / ( numberOfWorkers + traineers))
    println (middleSalaryPerEmployee) 
}
