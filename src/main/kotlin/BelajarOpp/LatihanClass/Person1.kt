package BelajarOpp.LatihanClass

class Person1 {

    var first: String = ""
    var last: String? = null
    var age: Int = 0
    //methods
    fun  BelajarPerson (name: String){
        println("hallo, $name, my name is $first")
    //methods run
    }

    fun sayHello(firstnameparam: String, lastnameparam: String){
        println("hello $firstnameparam $lastnameparam, my name is ${this.first}")
    }
    fun sayhello(firstnama: String, lastnama: String){
        println("hello $firstnama $lastnama, my name is ${this.first}")
    }
    fun run (){
        println("im runnn")
    }
    //methods getfullname
    fun getFullName() : String{
        return "$first, $last, usia anda adalah = $age"
    }


}