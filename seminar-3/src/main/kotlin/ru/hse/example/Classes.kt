package ru.hse.example

fun main() {
    val person = Person()
    person.name = "name"

    val person1 = Person1("name", 5)
}

class Person {
    var name: String = ""
    var age: Int = 0

    fun speak() {
        // todo
    }
}

class Person1(
    val name: String,
    val age: Int,
)

class Person2(
    val surname: String,
) {
    var name: String = ""
    var age = 0

    constructor(name: String, age: Int) : this("name") {
        this.name = name
    }
}

open class Animal {
    open fun makeSound() {

    }
}

class Dog : Animal() {

    override fun makeSound() {
        super.makeSound()
    }
}

fun main2() {
    val country = Country("", 0)
    val country2 = country.copy(flag = 5)
}

data class Country(
    val name: String,
    val flag: Int,
)