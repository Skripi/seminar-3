package ru.hse.example

fun save() {
    greet("Gri")
}

fun add(a: Int, b: Int): Int = a + b

fun greet(name: String = "Guest") {
    println("Hi. $name")
}

fun calculate(
    a: Int,
    b: Int,
    operation: (Int, Int) -> Int,
    operation2: (Int, Int) -> Int
): Int {
    return operation(a, b)
}

fun main() {
    var name: String? = null

    name?.length ?: 0

    name?.let {
        name.length
    } ?: {
        0
    }

    if (name != null) {
        // something do
    } else {

    }

    println(name!!.length)
    println(requireNotNull(name).length)
}