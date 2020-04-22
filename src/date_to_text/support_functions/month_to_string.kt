package date_to_text.support_functions
import date_to_text.*

fun monthToStr(month: Int): String {
    if (month == 1)
        return if (externDay <= 31) "января"
        else incorrectDateWarning
    
    if (month == 2) 
        return if (externDay <= 29) "февраля"
        else incorrectDateWarning
    
    if (month == 3)
        return if (externDay <= 31) "марта"
        else incorrectDateWarning
    
    if (month == 4)
        return if (externDay <= 30) "апреля"
        else incorrectDateWarning
    
    if (month == 5)
        return if (externDay <= 31) "мая"
        else incorrectDateWarning
    
    if (month == 6)
        return if (externDay <= 30) "июня"
        else incorrectDateWarning
    
    if (month == 7)
        return if (externDay <= 31) "июля"
        else incorrectDateWarning
    
    if (month == 8)
        return if (externDay <= 31) "августа"
        else incorrectDateWarning
    
    if (month == 9)
        return if (externDay <= 30) "сентября"
        else incorrectDateWarning
    
    if (month == 10)
        return if (externDay <= 31) "октября"
        else incorrectDateWarning
    
    if (month == 11)
        return if (externDay <= 30) "ноября"
        else incorrectDateWarning
    
    if (month == 12)
        return if (externDay <= 31) "декабря"
        else incorrectDateWarning
    
    return incorrectDateWarning
}