package BelajarOpp.LatihanClass

// Definisi kelas Person
class Person (val name: String, val age: Int) {

    // Apa pun yang mungkin ada di dalam kelas Person
    fun printInfo (){
        println ("Nama : " + name + "age :" + age)
    }
}

fun main() {
    // Membuat objek dari kelas Person
    val person1 = Person("faishol", 40)
    val person2 = Person("asya", 30)

    // Anda dapat membuat sejumlah objek sesuai kebutuhan
    // Ini hanya contoh sederhana
    person1.printInfo()
    person2.printInfo()
}
