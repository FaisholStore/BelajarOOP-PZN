package BelajarOpp.latihanClassLanjut

open class `Super Constructor` (val name: String, val type: String, val balance: Double) {

    constructor(name: String, type: String) : this(name, type, 0.0)
    constructor(name: String): this(name, "super")
}
class premiumcustomer : `Super Constructor`{
    constructor(name: String): super(name, "premiumcustomer")
    constructor(name: String,balance: Long): super(name, "premiumcustom", balance.toDouble())
}