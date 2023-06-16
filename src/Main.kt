import kotlin.system.measureTimeMillis

fun main () {
 //   firstTask()
 //   secondTask()
    println("Время выполнения первого задания: " + thirdTask { firstTask() })
    println("Время выполнения второго задания: " + thirdTask { secondTask() })
}

    fun firstTask ():Int {
        val numbers = (1..99)
            .toList()
            .filter { it%2==0 }
            .slice(9..19)
            .sumOf{it+1}

        println("Сумма оставшихся чисел: "+ numbers)
        println(" ")
        return numbers
    }

    fun secondTask():Unit {
        val personList = listOf(
            Person("Anna","Petrova", 33),
            Person ("Maria", "Ivanova", 22),
            Person ("Anna", "Divileva", 25),
            Person ("Ivan", "Karev", 19),
            Person ("Maria", "Bonokhova", 40),
            Person ("Denis", "Galeev", 28)
                )

        personList.sortDescAge().forEach { println(it) }
        println(" ")
        personList.sortByAlphabeth().forEach { println(it)}

    }

    fun thirdTask (action: () -> Unit) : Long {
        val start = System.currentTimeMillis()
        action()
        return System.currentTimeMillis() - start
    }








