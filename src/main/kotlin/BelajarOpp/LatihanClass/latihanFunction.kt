package BelajarOpp.LatihanClass

class latihanFunction {

    var firstname: String = ""
    var lastname: String? = ""
    var age : Int = 0 // you need to provide an intial value for this 'age'

    constructor(firstname: String, lastname: String, age: Int) {
        this.firstname = firstname
        this.lastname = lastname
        this.age = age
    }
    // method the introduce function
    fun introduce(){
        println("hello, my name is $firstname $lastname  and I am $age years old." )
    }
    fun Run () {
        println("percobaan runn ya guysss")
    }
    fun GetFullname (): String {
        return "$firstname $lastname"
    }
}