package BelajarOpp.BelajarobejectLanjut

import BelajarOpp.latihanClassLanjut.SmartPhone


fun main() {
    val smartphone=SmartPhone("samsung","android")

    println(smartphone.toString())
    println(smartphone.hashCode())
    println(smartphone.equals(smartphone))
}