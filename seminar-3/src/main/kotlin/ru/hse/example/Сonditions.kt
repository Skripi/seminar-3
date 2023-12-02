package ru.hse.example

fun main() {

    val term: Int
    val check = true

    term = if (check) 1 else 2

    // when
    val result = when {
        term < 0 -> {
            "very cold"
        }

        term < 10 -> {
            "a bit cold"
        }
        else -> {
            "hot"
        }
    }
}