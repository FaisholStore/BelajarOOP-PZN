package BelajarOpp.BelajarObject

import BelajarOpp.LatihanClass.Person1

fun main() {

    val faishol = Person1()
    faishol.first = "faishol "
    faishol.last  = "wijanarko"
    faishol.age = 50


    faishol.BelajarPerson("Asya")
    faishol.run()
    val fullName = faishol.getFullName()
    println(fullName)
}