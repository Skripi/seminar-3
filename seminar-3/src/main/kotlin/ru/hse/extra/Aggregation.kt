package ru.hse.extra

class Engine {
    fun start() {
        // start
    }
}

class CarV2(
    private val engine: Engine
) {

    fun drive() {
        engine.start()
    }
}

fun main() {
    val engine = Engine()
    val car = CarV2(engine)
    car.drive()
}