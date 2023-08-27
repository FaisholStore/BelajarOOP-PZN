package BelajarOpp.latihanClassLanjut

class userMahasiswa(val nama: String, val nim: String, val fakultas: String, val jurusan: String) {

    override fun toString(): String {
        return "Nama: $nama\nNim: $nim\nFakultas: $jurusan"
    }
}