/**
 * Автор: Смирнова Е.В., группа №P3355
 * Функция dateDigitToStr в файле date_to_text.kt возвращает заданную в формате DD.MM.YYYY HH:MM:SS
 * дату прописью по-русски.
 * Она базируется на вспомогательных функциях, которые возвращают текстовые эквиваленты
 * для отдельных частей даты (дня, месяца, года, etc)
 */
import date_to_text.dateDigitToStr

fun main(args: Array<String>) {
    print("Введите дату: ")
    var date = readLine()
    print("Дата в текстовом эквиваленте: ")
    if (date != null) println(dateDigitToStr(date))
}