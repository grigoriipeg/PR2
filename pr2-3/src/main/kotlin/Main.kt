fun main() {
    println("Задача №3. Создать приложение, которое преобразует введенное пользователем натуральное число из 10-ичной системы в двоичную")
    print("Введите натуральное число: ")
    var input = readln()
    try {
        val number: String = Integer.toBinaryString(input.toInt())
        println("Число в двоичной системе: $number")
    }
    catch (e: NumberFormatException) {
        println("Число не является натуральным.")
    }
}