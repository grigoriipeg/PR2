fun main() {
    println("Задача №7. Создать приложение, в котором пользователь дает на вход два числовых массива, " +
            "числа в массиве могут повторяться. На выходе приложение выдает пересечение этих массивов. " +
            "Например, на входе [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3, 2, 2]. На выходе должны получить [1, 2, 2, 3]  ")
    try {
        print("Введите первый массив цифр (через пробел): ")
        var A = readln().split(" ")
        var mas1 = mutableListOf<Int>()//1,2,3,2,0
        for (a in A) {
            mas1.add(a.toInt())
        }
        print("Введите второй массив цифр (через пробел): ")
        var B = readln().split(" ")
        var mas2 = mutableListOf<Int>()//5,1,2,7,3,2,2
        for (b in B) {
            mas2.add(b.toInt())
        }

        val mas = mutableListOf<Int>()
        for (a in mas1){
            if (a in mas2) {
                mas.add(a)
                mas2.remove(a)
            }
        }
        println("Результат пересечения чисел массивов: ")
        println(mas)
    }catch (e: Exception) {
        println("Неверный формат данных!")
    }
}