package BelajarOpp.BelajarobejectLanjut

import BelajarOpp.latihanClassLanjut.Handpone
import BelajarOpp.latihanClassLanjut.laptop

fun PrintObject(any: Any){

    if (any is laptop){
    println("laptop with name ${any.name}")
    }else if (any is Handpone){
        println("handpone with name ${any.name}")

    }else{
        println(any)
    }

}

fun printString(any: Any){
    val value  = any as String
    println(value)
}

fun printStringSafe(any: Any){
    val value: String?  = any as? String
    println(value)
}
fun PrintObjectwithwhen(any: Any) {

    when (any) {
        is laptop -> println("laptop with name ${any.name}")
        is Handpone -> println("handpone with name ${any.name}")
        else -> println(any)
    }
}



fun main() {
    printString("faishol")
//    printString(1) erorr
    printStringSafe(1)
    PrintObject("faishol")
    PrintObject(1)
    PrintObject(2)
    PrintObject(3)
    PrintObject(laptop("asus"))
    PrintObject(Handpone("Xiaomi"))
}