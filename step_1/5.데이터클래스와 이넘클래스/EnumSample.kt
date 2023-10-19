enum class Color(val label:String, val code:String){
    RED("red","#FE2E2E"),
    YELLOW("yellow","#111111"),
    GREEN("green","#222222"),
    BLUE("blue","#333333");
}

enum class HttpStatus(val label:String, val code:Int){
    REDIRECT("rediect", 300){
        override fun isServerError():Boolean{
            return false
        }
    },
    BAD_REQUEST("bed request", 400){
        override fun isServerError():Boolean{
            return false
        }
    },
    INTERNAL_ERROR("internal error", 500){
        override fun isServerError():Boolean{
            return true
        }
    };

    abstract fun isServerError(): Boolean
}

enum class HttpStatus2(val label:String, val code:Int): CheckStatus{
    REDIRECT("rediect", 300){
        override fun isServerError():Boolean{
            return false
        }
    },
    BAD_REQUEST("bed request", 400){
        override fun isServerError():Boolean{
            return false
        }
    },
    INTERNAL_ERROR("internal error", 500){
        override fun isServerError():Boolean{
            return true
        }
    };
}

interface CheckStatus{
    fun isServerError():Boolean
}


fun colorTest(){
    val red = Color.RED
    println(red)
    println(red.label)
    println(red.code)

    for (temp in Color.values()){
        println("Label : ${temp.label}, Code : ${temp.code}")
    }
}

fun httpsTest(){
    println(HttpStatus.BAD_REQUEST)
    println(HttpStatus.BAD_REQUEST.label)
    println(HttpStatus.BAD_REQUEST.code)

    println(HttpStatus.BAD_REQUEST.isServerError())
    println(HttpStatus.INTERNAL_ERROR.isServerError())

    println(HttpStatus2.BAD_REQUEST.isServerError())
    println(HttpStatus2.INTERNAL_ERROR.isServerError())
}

fun main(){
    colorTest()
    httpsTest()
}