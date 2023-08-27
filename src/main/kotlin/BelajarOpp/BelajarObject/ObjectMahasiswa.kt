package BelajarOpp.BelajarObject

import BelajarOpp.LatihanClass.Mahasiswa


fun main() {
    val mahasiswa1 = Mahasiswa("John Doe", "123456")
    val mahasiswa2 = Mahasiswa("John Doe", "987654")

    println("Informasi Mahasiswa 1:")
    mahasiswa1.displayInfo()

    println("\nInformasi Mahasiswa 2:")
    mahasiswa2.displayInfo()
}