package BelajarOpp.latihanClassLanjut

 open class Inheritance (val name: String, val jenisMakanan: String ) {
     open fun ras(s: String) {
         println("$name ini adalah ras $s")
     }

    final fun makan (){
        println("$name sedang memakan $jenisMakanan")
    }
    // Deklarasi subclass kucing yang mewarisii dari hewan

     open fun suara() {}
 }
    class Kucing (name: String, jenisMakanan: String,  val ras: String) : Inheritance(name, jenisMakanan){

        //fungsi suara khsuus kucing

        override fun suara (){
            println("$name mengeluarkan suara 'meow meoww ")
        }

        override fun ras(s: String) {
            println("$name ini adalah ras  $ras")
        }

        fun ras() {

        }
    }

     //Deklarasi Subclass babi yang mewarisii dari hewan
    class Babi (name: String, jenisMakanan: String, val  berat: Double): Inheritance(name, jenisMakanan) {
         //fungsi suara khsuus kucing
         override fun ras(s: String) {
             println("$name ini adalah ras babi dengan $s")
         }
        override fun suara (){
            println("$name mengeluarkan suara 'oink oink '")
        }
     }

        // Deklarasi subclass Kambing yang mewarisi dari Hewan
        class Kambing(name: String, jenisMakanan: String, val warna: String) : Inheritance(name, jenisMakanan) {
        // Fungsi suara khusus Kambing
        override fun ras(s: String) {
            println("$name ini adalah ras kambing dengan $s")
        }
        override fun suara() {
            println("$name mengeluarkan suara 'Mbeek Mbeek'")
             }
        }


