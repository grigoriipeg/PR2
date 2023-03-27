fun main() {
    println("Задача №2. Создать приложение, которое подсчитывает количество различных символов во введенной строке. " +
            "Символы в ответе расположить в алфавитном порядке. Например, дана строка AASADDSS. На выходе получаем: \n" +
            "A - 3\n" +
            "D - 2\n" +
            "S - 3")
    print("Введите строку: ")
    var str: String = readln()
    var list = str.toCharArray()
    list.sort()

    var s = list[0]
    var count = 0
    for (x in list + ' '){
        if (x == s){
            count++
        }else{
            println("$s - $count")
            s = x
            count = 1
        }
    }
}