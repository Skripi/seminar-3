package ru.hse.extra

class Heart {
    fun beat() {
        println("")
    }
}

class Person {
    private val heart = Heart()

    fun startLife() {
        heart.beat()
    }
}

fun main() {
    val person = Person()
    person.startLife()
}