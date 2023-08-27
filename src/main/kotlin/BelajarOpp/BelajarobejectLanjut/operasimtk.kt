package BelajarOpp.BelajarobejectLanjut

import BelajarOpp.latihanClassLanjut.OperasiMatematika

fun main() {

    val penjumlahan = OperasiMatematika()

    //menampilkan nama operasi dari obejeck penjumlahan

    println("Opersi : ${penjumlahan.infoOperasi()}")


    //memanggil fungsi lakukan operasi melakukan penjumlahan
    println ("Hasil : ${penjumlahan.lakukanOperasi(6,3)}")
}