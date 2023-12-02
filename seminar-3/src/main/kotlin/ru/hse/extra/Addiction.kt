package ru.hse.extra

class Car {
    fun start() {
        // start
    }
}

class Driver {

    fun drive(car: Car) {
        car.start()
    }
}

fun main() {
    val car = Car()
    val driver = Driver()

    driver.drive(car)
}