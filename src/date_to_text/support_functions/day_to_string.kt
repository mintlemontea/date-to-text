package date_to_text.support_functions
import date_to_text.*

//функция переводит день в текстовый эквивалент
fun dayToStr(day: Int): String {
    var strDay = ""
    when (day) {
        10 -> return "десятое"
        11 -> return "одиннадцатое"
        12 -> return "двенадцатое"
        13 -> return "тринадцатое"
        14 -> return "четырнадцатое"
        15 -> return "пятнадцатое"
        16 -> return "шестнадцатое"
        17 -> return "семнадцатое"
        18 -> return "восемнадцатое"
        19 -> return "девятнадцатое"
        20 -> return "двадцатое"
        30 -> return "тридцатое"
        in 21..29 -> strDay = "двадцать "
        in 30..31 -> strDay = "тридцать "
    }

    when (day % 10) {
        1 -> return strDay.plus("первое")
        2 -> return strDay.plus("второе")
        3 -> return strDay.plus("третье")
        4 -> return strDay.plus("четвёртое")
        5 -> return strDay.plus("пятое")
        6 -> return strDay.plus("шестое")
        7 -> return strDay.plus("седьмое")
        8 -> return strDay.plus("восьмое")
        9 -> return strDay.plus("девятое")
    }
    
    return incorrectDateWarning
}