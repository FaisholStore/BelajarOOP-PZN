//package BelajarOpp.LatihanClass
//
//class Animal(var name: String = "KUCINGGGGG",
//             val weight: Double,
//             val age: Int,
//             val isMammal: Boolean
//)
//{
//
//    fun eat(){
//        println("$name makan!")
//    }
//
//    fun sleep() {
//        println("$name tidur!")
//    }
//}
//
//
//fun main() {
//    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
//    dicodingCat.eat()
//    dicodingCat.sleep()
//
//    // Mengubah nama
//    dicodingCat.name = "KUCINGGGGG"
//
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
//}
import kotlin.reflect.KProperty


class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}
fun main(){
    val animal = Animal()
    animal.name = "Dicoding cat"
    animal.weight = 6.2
    animal.age = 1

    println("Nama: ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur: ${animal.age} Tahun")
}