package BelajarOpp.LatihanClass

class Mahasiswa(val Nama: String, val NIM: String) {
    // Contoh metode untuk menampilkan informasi mahasiswa
    fun displayInfo() {
        println("Nama: $Nama")
        println("NIM: $NIM")
    }
}