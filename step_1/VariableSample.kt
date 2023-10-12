

/*
* val
* - 변수를 선언할 때 지정한 값에서 더 이상 변경하지 않아야 하는 경우 사용
* var
* - 변수의 값을 바꿀 수 있어야 하는 경우 사용
* 
* 변수의 선언
* - val variableName:DataType = "value"
* - 자료형 추론 이라고 부르고 생략 가능
*
* 변수의 출력
* - println("print value : $value") 
* 
* 데이터 타입
* - 코틀린은 Reference Data Type을 사용
* - 객체(메모리)를 생성하고 데이터를 할당받는 방식
* - 단, 참조형으로 생성된 객체는 컴파일 과정에서 기본형으로 대체되어 문제없이 사용 가능
* - 데이터 타입의 최상위 클래스는 Any가 있음
* -
* - 모든 것을 객체로 생성하는것은 메모리 최적화에 적합하지 않다. 하지만 컴파일 과정에서
* - 기본형으로 변하기 때문에 객체로 사용해도 괜찮다
*
* 숫자형 데이터 타입
* - Short, Byte를 사용하기 위해서는 명시적으로 작성 해야함
* - 아니라면 보통 int 형태로 추론함
* - 자리수 구문하기 위해 (_) 사용 가능
*/


fun main(){
    val name: String = "Flature"
    val org = "Around Hub Studio"
    var age = 12
    // org = "Hi" 이건 val형으로 선언했기에 에러
    age = 28

    println("My name is $name")    
    println("My age is $age")
    println(org)

}



