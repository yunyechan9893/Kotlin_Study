class User Constructor(name:String,age:Int, sex:Boolean){
    Constructor(name:String, age:Int, sex:String, auth:Int){
        if (auth==1){
            println("안녕하세요. 관리자님")
        }
    }

    fun introduce(){
        println("안녕, 나는 $name 이야. 나이는 $age이야. 잘 부탁해")
    }

}


fun main(){
    user_minsu = User("민수", 23, "남자")
    user_minsu.introduce()

    user_jiwon = User("지원", 25, "여자", 1)
    user_jiwon.introduce()
}