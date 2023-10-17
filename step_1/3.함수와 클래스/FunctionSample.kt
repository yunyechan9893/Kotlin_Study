/*
* # 함수 기본구조
**
* fun 함수명(인자:타입, 인자:타입) : return 타입{
* return 값
* }
**
*
* # 파라미터 기본값 사용 구조
**
* fun 함수명(인자:타입=기본값, 인자:타입=기본값) : return 타입{
* return 값
* }
**
*/

fun main(){
    val a = 5
    val b = 2

    println(sum(a,b))
    divide_with_three(a)
    println(multi(a,b))
}

fun sum(a:Int, b:Int):Int{
    return a+b
}

// 파이썬을 많이 사용하다보니 타입지정 하는것을 가끔 깜빡함
fun divide_with_three(a:Int, b:Int=3){
    println(a+b)
}

fun multi(a:Int, b:Int) = a*b