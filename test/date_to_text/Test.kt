package date_to_text

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Test {
    @Test
    fun dateDigitToStr() {

        assertEquals(
            "тридцатое мая две тысячи шестнадцатого года восемь часов сорок пять минут тридцать секунд",
            dateDigitToStr("30.05.2016 08:45:30")
        )
        assertEquals(
            "первое апреля пять тысяч двадцать первого года двадцать три часа двенадцать минут двадцать семь секунд",
            dateDigitToStr("01.04.5021 23:12:27")
        )
        assertEquals(
            "двадцать восьмое января шесть тысяч девятьсот девяносто девятого года ноль часов двадцать одна минута ноль секунд",
            dateDigitToStr("28.01.6999 00:21:00")
        )
        assertEquals(
            "тринадцатое декабря триста первого года девять часов ноль минут пятьдесят девять секунд",
            dateDigitToStr("13.12.0301 09:00:59")
        )
        assertEquals(
            "Несоответствующий формат входных данных",
            dateDigitToStr("31.02.2020 13:33:30")
        )
        assertEquals(
            "Несоответствующий формат входных данных",
            dateDigitToStr("31.02.20 10:54:29")
        )
    }
}