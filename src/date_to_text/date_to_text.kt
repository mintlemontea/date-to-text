/**
 * Автор: Смирнова Е.В., группа №P3355
 * Функция dateDigitToStr возвращает заданную в формате DD.MM.YYYY HH:MM:SS
 * дату прописью по-русски.
 * Она базируется на вспомогательных функциях, которые возвращают текстовые эквиваленты
 * для отдельных частей даты (дня, месяца, года, etc)
 */

package date_to_text
import date_to_text.support_functions.*

const val incorrectDateWarning = "Несоответствующий формат входных данных"
var externDay = 0

fun dateDigitToStr(digital: String): String {

    val patDate = digital.matches(Regex("""\d\d\.(0\d|1[0-2])\.\d{4}\s([01]\d|2[0-4]):\d\d:\d\d"""))
    if (!patDate) {
        return incorrectDateWarning
    }

    val date: List<String> = digital.split(".", " ", ":")

//    dateLine.map { it.toInt() }

    val day = date[0].toInt()
    val month = date[1].toInt()
    val year = date[2].toInt()
    val hours = date[3].toInt()
    val minutes = date[4].toInt()
    val seconds = date[5].toInt()

    externDay = day

    //проверка корректности даты
    //проверка месяца и часов есть в регулярном выражении
    if (
        (day < 1 || day > 31) || (year < 1)
        || (minutes < 0 || minutes > 59) || (seconds < 0 || seconds > 59)
    ) {
        return incorrectDateWarning
    }

    var strDay: String = dayToStr(day)
    var strMonth: String = monthToStr(month)
    var strYear: String = yearToStr(year)
    var strHours: String = hoursToStr(hours)
    var strMinutes: String = minutesToStr(minutes)
    var strSeconds: String = secondsToStr(seconds)

    if (strMonth != incorrectDateWarning) {
        val result = "$strDay $strMonth $strYear $strHours $strMinutes $strSeconds" //добавить секунды и минуты
        return result
    } else return incorrectDateWarning
}