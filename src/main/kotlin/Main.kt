package ru.netology

const val online = 512
fun main() {
    when (online) {
        in 0..59 -> println("Был(а) в сети только что")
        in 60..3599 -> calcMinute()
        in 3600..86399 -> calcHour()
        in 86400..172799 -> println("Сегодня был в сети")
        in 172800..259199 -> println("Был в сети вчера")
        else -> println("Был в сети давно")
    }
}

fun calcMinute() {
    when (val minute = online / 60) {
        1, 21, 31, 41, 51 -> println("Был(а) в сети $minute минуту назад")
        in 5..20, in 25..30 -> println("Был(а) в сети $minute минут назад")
        else -> println("Был(а) в сети $minute минуты назад")
    }
}

fun calcHour() {
    when (val hour = online / 60 / 60) {
        1, 21, 31, 41, 51 -> println("Был(а) в сети $hour час назад")
        in 5..20, in 25..30 -> println("Был(а) в сети $hour часов назад")
        else -> println("Был(а) в сети $hour часа назад")
    }
}




