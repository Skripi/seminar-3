package ru.hse.example

fun main() {

    val a = 5

    for (i in 1..a) {
        // todo something
    }

    for (i in 5 downTo 1) {
    }

    for (i in 1..10 step 2) {
    }

    val fruits = listOf<String>("apple", "banana")
    for (fruit in fruits) {
        println(fruit)
    }

    for ((index, fruit) in fruits.withIndex()) {
        println(fruit)
    }

    fruits.forEach {  fruit ->

    }

    fruits.forEachIndexed { index, fruit -> }

    var y = 10
    while (y > 0) {
        println(y)
        y -= 2
    }

    var z = 0
    do {
        println(z)
    } while (z < 5)
}