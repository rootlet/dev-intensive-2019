package ru.skillbranch.devintensive.extensions

import java.lang.IllegalStateException
import java.text.SimpleDateFormat
import java.util.*

fun Date.format(pattern:String = "HH:mm:ss dd.MM.yy"): String {
    val dateFormat = SimpleDateFormat(pattern, Locale("ru"))
    return dateFormat.format(this)
}

const val SECONDS = 1000L
const val MINUTES = 60 * SECONDS
const val HOUR = 60 * MINUTES
const val DAY = 24 * HOUR

fun Date.add(value: Int, units: TimeUnits = TimeUnits.SECOND): Date {
    var time = this.time
    time += when(units){
        TimeUnits.SECOND-> value * SECONDS
        TimeUnits.MINUTE-> value * MINUTES
        TimeUnits.HOUR-> value * HOUR
        TimeUnits.DAY-> value * DAY
        else -> throw IllegalStateException("invalid unit")
    }

    this.time = time
    return this
}


enum class TimeUnits{
    SECOND,
    MINUTE,
    HOUR,
    DAY
}