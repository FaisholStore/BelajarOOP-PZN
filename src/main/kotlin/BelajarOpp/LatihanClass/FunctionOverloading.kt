package BelajarOpp.LatihanClass

class FunctionOverloading {


    fun printInfo(nama: String){
        println("nama: $nama")
    }
    fun printInfo(nama: String, umur: Int){
        println("nama: $nama, umur: $umur")
    }

    fun printInfo(nama: String, umur: Int, jurusan: String){
        println("nama: $nama, umur: $umur, jurusan: $jurusan" )
    }

}

