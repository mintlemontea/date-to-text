package date_to_text.support_functions

import date_to_text.incorrectDateWarning

fun minutesToStr(minutes: Int): String {
    var strMinutes = ""
    when (minutes) {
        0 -> return "ноль минут"
        1 -> return "одна минута"
        2 -> return "две минуты"
        3 -> return "три минуты"
        4 -> return "четыре минуты"
        5 -> return "пять минут"
        6 -> return "шесть минут"
        7 -> return "семь минут"
        8 -> return "восемь минут"
        9 -> return "девять минут"
        10 -> return "десять минут"
        11 -> return "одиннадцать минут"
        12 -> return "двенадцать минут"
        13 -> return "тринадцать минут"
        14 -> return "четырнадцать минут"
        15 -> return "пятнадцать минут"
        16 -> return "шестнадцать минут"
        17 -> return "семнадцать минут"
        18 -> return "восемнадцать минут"
        19 -> return "девятнадцать минут"
        20 -> return "двадцать минут"
        30 -> return "тридцать минут"
        40 -> return "сорок минут"
        50 -> return "пятьдесят минут"
        in 21..29 -> strMinutes += "двадцать "
        in 31..39 -> strMinutes += "тридцать "
        in 41..49 -> strMinutes += "сорок "
        in 51..59 -> strMinutes += "пятьдесят "
    }

    when (minutes % 10) {
        1 -> return strMinutes.plus("одна минута")
        2 -> return strMinutes.plus("две минуты")
        3 -> return strMinutes.plus("три минуты")
        4 -> return strMinutes.plus("четыре минуты")
        5 -> return strMinutes.plus("пять минут")
        6 -> return strMinutes.plus("шесть минут")
        7 -> return strMinutes.plus("семь минут")
        8 -> return strMinutes.plus("восемь минут")
        9 -> return strMinutes.plus("девять минут")
    }

    return incorrectDateWarning
}