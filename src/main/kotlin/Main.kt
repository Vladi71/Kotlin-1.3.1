package ru.netology


fun main() {
    println(agoToText(60))
    println(agoToText(2000))
    println(agoToText(80000))
    println(agoToText(95000))
    println(agoToText(212000))
    println(agoToText(312000))
}


fun agoToText(secondsAgo: Int): String {
    return when (secondsAgo) {
        in 0..59 -> "Был(а) в сети только что"
        in 60..3599 -> calcMinute(secondsAgo)
        in 3600..86399 -> calcHour(secondsAgo)
        in 86400..172799 -> "Сегодня был(а) в сети"
        in 172800..259199 -> "Был(а) в сети вчера"
        else -> "Был(а) в сети давно"
    }
}

fun calcMinute(secondsAgo: Int): String {
   return when (val minute = secondsAgo / 60) {
        1, 21, 31, 41, 51 -> "Был(а) в сети $minute минуту назад"
        in 5..20, in 25..30 -> "Был(а) в сети $minute минут назад"
        else -> "Был(а) в сети $minute минуты назад"
    }
}

fun calcHour(secondsAgo: Int): String {
  return  when (val hour = secondsAgo / 60 / 60) {
        1, 21, 31, 41, 51 -> "Был(а) в сети $hour час назад"
        in 5..20, in 25..30 -> "Был(а) в сети $hour часов назад"
        else -> "Был(а) в сети $hour часа назад"
    }
}




