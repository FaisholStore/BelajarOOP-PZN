package belajaropp.belajarobejectlanjut

import BelajarOpp.latihanClassLanjut.premiumcustomer

fun main() {
    val customer1 = premiumcustomer("faishol")
    println("customer1- nama: ${customer1.name}, type: ${customer1.type},balance:" + " ${customer1.balance}")
    val customer2 = premiumcustomer("asyaan",20000)
    println("customer2- nama: ${customer2.name}, type: ${customer2.type},balance:" + " ${customer2.balance}")
}
