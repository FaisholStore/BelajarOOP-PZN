package BelajarOpp.latihanClassLanjut

//pewaris
open class pewarisan (val name: String) {

    fun sayhello(name: String) {
        println("hello $name, my name is ${this.name}")
    }
}
//child 2
class ManajerOnwer ( name: String) : pewarisan(name)
//child 3
class Onwer ( name: String) : pewarisan(name)