package BelajarOpp.BelajarobejectLanjut

import BelajarOpp.latihanClassLanjut.Babi
import BelajarOpp.latihanClassLanjut.Kambing
import BelajarOpp.latihanClassLanjut.Kucing



fun main() {
    val kucingSuper = Kucing("Kucing Ini Super", "Ikan", "Anggora")
    val babiGemuk = Babi("Babi Gemuk", "Rumput", 150.0)
    val kambingKeren = Kambing("Kambing Keren", "Rumput", "Hitam Putih")

    kucingSuper.makan()
    kucingSuper.suara()
    kucingSuper.ras("Anggora") // Berikan nilai ras yang sesuai

    babiGemuk.makan()
    babiGemuk.suara()
    babiGemuk.ras("Babi Gemuk") // Berikan nilai ras yang sesuai

    kambingKeren.makan()
    kambingKeren.suara()
    kambingKeren.ras("Hitam Putih") // Berikan nilai ras yang sesuai
}
