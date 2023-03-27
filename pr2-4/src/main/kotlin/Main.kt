fun main() {
    println("Задача №4. Создать приложение, с помощью которого пользователь, введя два числа и символ операции, " +
            "узнает результат. Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание. " +
            "Числа могут быть вещественными. Числа и знак операции разделяются между собой одним пробелом. " +
            "Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")
    println("Введите через пробел: ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ");
    try {
        var str = readln().split(" ")
        var number1 = str[0].toDouble()
        var number2 = str[1].toDouble()
        var sign = str[2]

        when (sign) {
            "*" -> println(number1 * number2)
            "/" ->
                try {
                    val c = number1 / number2
                    println(c)
                } catch (e: Exception) {
                    println("Делить на 0 нельзя!");
                }

            "+" -> println(number1 + number2)
            "-" -> println(number1 - number2)
        }
    }catch (e:Exception){
        println("Неверный ввод данных, попробуйте снова");
    }
}