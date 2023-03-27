fun main() {
    println("Задача №1. Создать приложение, которое подсчитывает количество подряд идущих одинаковых " +
            "символов во введенной строке. На вход подается, например, строка AAADSSSRRTTHAAAA. " +
            "На выходе получаем A3DS3R2T2HA4. То есть, если количество подряд идущих символов меньше двух, " +
            "то мы не пишем единицу")
    print("Введите строку: ")
    var str: String = readln() + " "
    var s = str[0]
    var count = 0
    for (x in str){
        if (x == s){
            count++
        }else if(count < 2){
            print("$s")
            s = x
            count = 1
        }else{
            print("$s$count")
            s = x
            count = 1
        }
    }
}
