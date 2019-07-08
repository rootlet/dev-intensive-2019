package ru.skillbranch.devintensive.Utils

object Utils {
    fun parseFullName(fullName:String?): Pair<String?, String?>{
        val fixFullName = if(fullName == "" || fullName == " ") null else fullName
        val parts : List<String>? = fixFullName?.split(" ")
        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return Pair(firstName, lastName)
    }

    fun transliteration(payload: String, divider:String = " "): String {
        return payload
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        return " initials"
    }
}