package BelajarOpp.LatihanClass

class Car(val brand: String, val model: String, val year: Int) {
    // Properties
    var currentSpeed: Int = 0
        private set

    // Methods
    fun accelerate(speedIncrease: Int, accelerationHandler: (Int) -> Unit) {
        currentSpeed += speedIncrease
        accelerationHandler(currentSpeed)
    }


    fun brake(speedDecrease:Int , brakeHandler: (Int) -> Unit) {
        if (currentSpeed >= speedDecrease){
            currentSpeed -= speedDecrease
            brakeHandler(currentSpeed)
        } else{
            println("cant brake more than speed")
        }
    }

    fun stop(stopHandler: () -> Unit) {
        currentSpeed = 0
        stopHandler()
    }


}


