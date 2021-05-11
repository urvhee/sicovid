package mtiui.dtpl.sicovid.utils.extension

import java.text.SimpleDateFormat
import java.util.*

fun String.toDate(dateFormat: String = "yyyy-MM-dd'T'HH:mm:ss.SSS", timeZone: TimeZone = TimeZone.getTimeZone("UTC")): Date? {
    val parser = SimpleDateFormat(dateFormat, Locale.getDefault())
    parser.timeZone = timeZone
    return parser.parse(this)
}