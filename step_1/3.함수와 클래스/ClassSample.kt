class User constructor(name:String,age:Int, sex:String){
    var name:String = name
    var age:Int = age
    var sex:String = sex

    init{
        println("$name init")
    }

    constructor(name:String, age:Int, sex:String, auth:Int):this(name, age, sex) {
        if (auth==1){
            println("hi, king")
        }else{
            println("$name, $age, $sex")
        }
    }

    fun introduce(){
        println("hi, i'm $name, $age years old. nice to meet you")
    }

}   


fun main(){
    val user_minsu = User("minso", 23, "male")
    user_minsu.introduce()

    val user_jiwon = User("jiwon", 25, "female", 1)
    user_jiwon.introduce()
}