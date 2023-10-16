/*
* ※ 아는 문법들은 넘어감
* if문
* for문
* while문
* do while 문도 존재함
*
* when 문
* - 여러 케이스에 대해 구분하기 위해 사용
* - if문 비교적 많이 사용할때 좋음
* - 조건이나 범위 설정 가능
*   
*
 */

 import kotlin.random.Random

 fun main(){
    ifExpression()
    whenSample()
 }

 fun ifExpression(){
    val num1 = 1
    val num2 = 3

    var num = if (num1 > num2) 4 else 5
    println(num)
 }

 fun whenSample(){
    var randomA = Random.nextInt(5)
    var randomB = Random.nextInt(5)
    when (randomA){
        1, 2 -> println("a == 1 or 2")
        3 -> println("a == 3")
        4 -> println("a == 4")
    }

    when {
      randomA > randomB -> println("A가 더 크다")
      randomA < randomB -> println("A가 더 크다")
    }
 }