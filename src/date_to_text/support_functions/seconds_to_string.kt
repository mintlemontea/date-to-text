package date_to_text.support_functions
import date_to_text.*

fun secondsToStr(seconds: Int): String {
    var strSeconds = ""
    when (seconds) {
        0 -> return "ноль секунд"
        1 -> return "одна секунда"
        2 -> return "две секунды"
        3 -> return "три секунды"
        4 -> return "четыре секунды"
        5 -> return "пять секунд"
        6 -> return "шесть секунд"
        7 -> return "семь секунд"
        8 -> return "восемь секунд"
        9 -> return "девять секунд"
        10 -> return "десять секунд"
        11 -> return "одиннадцать секунд"
        12 -> return "двенадцать секунд"
        13 -> return "тринадцать секунд"
        14 -> return "четырнадцать секунд"
        15 -> return "пятнадцать секунд"
        16 -> return "шестнадцать секунд"
        17 -> return "семнадцать секунд"
        18 -> return "восемнадцать секунд"
        19 -> return "девятнадцать секунд"
        20 -> return "двадцать секунд"
        30 -> return "тридцать секунд"
        40 -> return "сорок секунд"
        50 -> return "пятьдесят секунд"
        in 21..29 -> strSeconds += "двадцать "
        in 31..39 -> strSeconds += "тридцать "
        in 41..49 -> strSeconds += "сорок "
        in 51..59 -> strSeconds += "пятьдесят "
    }

    when (seconds % 10) {
        1 -> return strSeconds.plus("одна секунда")
        2 -> return strSeconds.plus("две секунды")
        3 -> return strSeconds.plus("три секунды")
        4 -> return strSeconds.plus("четыре секунды")
        5 -> return strSeconds.plus("пять секунд")
        6 -> return strSeconds.plus("шесть секунд")
        7 -> return strSeconds.plus("семь секунд")
        8 -> return strSeconds.plus("восемь секунд")
        9 -> return strSeconds.plus("девять секунд")
    }

    return incorrectDateWarning
}