package BelajarOpp.latihanClassLanjut

open class OperasiMatematika {
    open val namaOperasi: String = "Operasi Matematika"

    open fun lakukanOperasi(a: Int, b: Int): Int {
        return 0
    }

    fun infoOperasi(): String {
        return "Ini adalah $namaOperasi"
    }
}

class OperasiPenjumlahan : OperasiMatematika() {
    override val namaOperasi: String = "Penjumlahan"

    override fun lakukanOperasi(a: Int, b: Int): Int {
        return a + b
    }

    fun infoOperasiSuper(): String {
        return super.infoOperasi() // Menggunakan super untuk mengakses fungsi dari kelas induk
    }
}

