package BelajarOpp.LatihanClass

class `This Keyword` (val name: String, val age: Int) {

    //method printname
    fun printname(){
        println("nama form inside the class: $name")
    }


    //method print namefromoutside // this keyword

    fun printnamefromoutside(){
        println("name from outside the class: ${this.name}")
    }
    fun printAge (){
        println("age form inside the class: $age")
    }
    fun printAgeFromOutside (){
        println("age form inside the class: ${this.age}")
    }


}