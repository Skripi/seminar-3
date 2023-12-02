package ru.hse.example


private val list: List<Int> = emptyList()

fun main() {

    val fruits = listOf("apple")

    val animals = mutableListOf<String>("cat")

    val numberSet = setOf(1, 2)
    val numberSet2 = mutableSetOf(1, 2)

    val countryCapitals = mutableMapOf("Россия" to "Москва", "Франция" to "Париж")
    val countryCapitals2 = mutableMapOf(Pair("Россия", "Москва"), "Россия" to "Москва")

    5 add 3
    5 добавь 3


    animals.first()
    animals.last()
    animals.any { animal -> animal.length > 2 }
    val result = animals.all { animal -> animal.length > 2 }


    val numbers = listOf(1, 2, 3)
    val updatedNumbers = numbers.map { it * 2 }
}

infix fun Int.add(b: Int): Int {
    return this + b
}

infix fun Int.добавь(b: Int): Int {
    return this + b
}