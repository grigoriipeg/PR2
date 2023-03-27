fun main() {
    print("Создать приложение, в котором пользователь вводит массив из различных слов. На выходе приложение " +
            "должно показать слова сгруппированные по признаку \"состоят из одинаковых букв\". Например, на " +
            "входе [\"eat\", \"tea\", \"tan\", \"ate\", \"nat\", \"bat\"]. Получаем группы:\n" +
            "\"ate\", \"eat\", \"tea\"\n" +
            "\"nat\", \"tan\"\n" +
            "\"bat\" \n")
    try {
        val mas = arrayListOf<String>()
        print("Введите количество слов: ")
        for (i in 0 until readln().toInt()){
            print("Введите слово: ")
            mas.add(readln())
        }
        val result = mas.sortedBy { it.toCharArray().sorted().joinToString("") }
        print("Полученный массив: ")
        result.onEach { print("$it ") }
    } catch (e:NumberFormatException) {
        println("Некорректные данные!")
    }
}