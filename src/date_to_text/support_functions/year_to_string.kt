package date_to_text.support_functions
import kotlin.math.pow

fun yearToStr(year: Int): String {

    var modYear = year
    var resultYear = ""
    var counter = year.toString().length

    val units: Map<Int, String> = mapOf(
        1 to "первого", 2 to "второго", 3 to "третьего", 4 to "четвертого",
        5 to "пятого", 6 to "шестого", 7 to "седьмого", 8 to "восьмого", 9 to "девятого"
    )
    val tens: Map<Int, String> = mapOf(
        2 to "двадцать", 3 to "тридцать", 4 to "сорок",
        5 to "пятьдесят", 6 to "шестьдесят", 7 to "семьдесят", 8 to "восемьдесят", 9 to "девяносто"
    )
    val hundreds: Map<Int, String> = mapOf(
        1 to "сто", 2 to "двести", 3 to "триста",
        4 to "четыреста", 5 to "пятьсот", 6 to "шестьсот", 7 to "семьсот", 8 to "восемьсот", 9 to "девятьсот"
    )
    val thousands: Map<Int, String> = mapOf(
        1 to "одна тысяча", 2 to "две тысячи", 3 to "три тысячи",
        4 to "четыре тысячи", 5 to "пять тысяч", 6 to "шесть тысяч", 7 to "семь тысяч",
        8 to "восемь тысяч", 9 to "девять тысяч"
    )
    val special: Map<Int, String> = mapOf(
        10 to "десятого", 11 to "одиннадцатого", 12 to "двенадцатого",
        13 to "тринадцатого", 14 to "четырнадцатого", 15 to "пятнадцатого", 16 to "шестнадцатого",
        17 to "семнадцатого", 18 to "восемнадцатого", 19 to "девятнадцатого", 20 to "двадцатого",
        30 to "тридцатого", 40 to "сорокового", 50 to "пятидесятого", 60 to "шестидесятого",
        70 to "семидесятого", 80 to "восьмидесятого", 90 to "девяностого", 100 to "сотого",
        200 to "двухсотого", 300 to "трёхсотого", 400 to "четырёхсотого", 500 to "пятисотого",
        600 to "шестисотого", 700 to "семисотого", 800 to "восьмисотого", 900 to "девятисотого",
        1000 to "тысячного", 2000 to "двухтысячного", 3000 to "трёхтысячного", 4000 to "четырёхтысячного",
        5000 to "пятитысячного", 6000 to "шеститысячного", 7000 to "семитысячного", 8000 to "восьмитысячного",
        9000 to "девятитысячного"
    )
    val yearParts = arrayOf(units, tens, hundreds, thousands)

    var i = counter - 1
    while (i >= 0) {

        for ((specialDigYear, specialStrYear) in special)
            if (modYear == specialDigYear) {
                resultYear += specialStrYear
                return "$resultYear года"
            }

        for ((number, equivText) in yearParts[i])
            if ((modYear / 10.0.pow(i).toInt()) == number) {
                resultYear += "$equivText "
                modYear %= 10.0.pow(i).toInt()
                break
            }

        i--
    }

    return resultYear + "года"

}