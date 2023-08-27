package BelajarOpp.BelajarObject

import BelajarOpp.LatihanClass.Car

    fun main() {
        val myCar = Car("Toyota", "Corolla", 2022)
        val accelerationHandler: (Int) -> Unit = { speed ->
            println("Car is accelerating to $speed km/h")
        }
        val  breakHandler: (Int) -> Unit = { speed ->
            println("car is brake to $speed km/h")
        }
        val stopHandler: () -> Unit = {
            println("car is stopping")
        }
        myCar.accelerate(60, accelerationHandler)
        myCar.brake(40, breakHandler)
        myCar.stop(stopHandler)
    }
