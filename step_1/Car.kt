// import java.time.LocalDate

open class Car(val name:String, val price:Int, val brand:String){
    fun introduce(){
        println("My car is $name")
    }

    open fun howMuch(){
        println("My car is ${price}won")
    }

    open fun myPurchaseData(){
        println("you don't buy yet")
    }

    open fun compare(otherCar: Car){
        println("### comparison between ${this.name} and ${otherCar.name} ###")   
    }

}

class MyCar(name:String, price:Int, brand:String, private val purchaseDate:String):Car(name, price, brand){
    override fun myPurchaseData(){
        println("purchase data : $purchaseDate")
    }
}

fun main(){
    val gv70 = MyCar("GV70", 1_000_000_000, "Hyundai", "2023.10.17 11:10:00")
    val gv80 = MyCar("GV80", 2_000_000_000, "Hyundai", "2023.10.18 15:31:03")

    gv70.introduce()
    gv70.howMuch()
    gv70.myPurchaseData()

    println("=======")
    gv80.introduce()
    gv80.howMuch()
    gv80.myPurchaseData()

    println("=======")
    gv80.compare(gv70)
}