/*
A leap year (in the Gregorian calendar) occurs:

*In every year that is evenly divisible by 4.
*Unless the year is evenly divisible by 100, in which case it's only a leap year if the year is also evenly divisible by 400.
Some examples:

1997 was not a leap year as it's not divisible by 4.
1900 was not a leap year as it's not divisible by 400.
2000 was a leap year!

Instructions
Your task is to determine whether a given year is a leap year.
*/

fun isLeap(year: Int): Boolean {
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true
            } else {
                return false
            }
        } else {
            return true
        }
    } else {
        return false
    }
}

fun main() {
    if (isLeap(2016) == true) {
        println("É um ano bissexto")
    } else {
        println("Não é um ano bissexto")
    }
}
