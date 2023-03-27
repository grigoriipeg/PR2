import kotlin.math.log

fun main() {
    println("Задача №5. Создать приложение, в котором пользователь вводит две различных цифры. На выходе приложение " +
            "выдает, если это возможно, из введенных цифр, нечетное число. Результат выводится в консоль. При невозможности " +
            "создать нечетное число выводится сообщение – «Создать нечетное число невозможно»")
    println("x^y = n")
    print("Введите число N: ")
    val n = readln()
    print("Введите основание степени X: ")
    val x = readln()
    try {
        val res = (log(n.toDouble(), 10.0)  / log(x.toDouble(), 10.0)).toInt()
        if ((log(n.toDouble(), 10.0)  / log(x.toDouble(), 10.0)) - res == 0.0) {
            println(log(n.toDouble(), 10.0)  / log(x.toDouble(), 10.0))
        }
        else println("Целочисленный показатель не существует")
    }
    catch (e:NumberFormatException) {
        println("Некорректные данные!")
    }
}