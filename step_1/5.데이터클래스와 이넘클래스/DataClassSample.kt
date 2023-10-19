data class DataClassSample(val name:String, val age:Int)

class NoDataClassSample(val name:String, val age:Int)


fun main(){
    val dataClass1 = DataClassSample(name="minsu", age=19)
    val dataClass2 = DataClassSample(name="yechan", age=22)
    val dataClass3 = DataClassSample(name="yechan", age=22)

    // 데이터 값이 같으면 같은 해시코드값을 가짐
    println(dataClass1.hashCode())
    println(dataClass2.hashCode()) // dataClass1, dataClass2는 다르다
    println(dataClass3.hashCode()) // dataClass2, dataClass3은 같다

    println("name : ${dataClass1.component1()}") // 데이터 클래스 첫번째 인자값을 가져옴
    println("age : ${dataClass1.component2()}")

    val (name, age) = dataClass2
    println("$name, $age")

    val dataClass4 = dataClass3.copy()
    val dataClass5 = dataClass3.copy(name="jiwon") // 카피시에도 인자값을 변경할 수 있다

    println(dataClass4==dataClass3) // 카피시에도 해시값이 같음
    println(dataClass4)
    println(dataClass5)
    
    val noDataClass1 = NoDataClassSample(name="minsu", age=19)
    val noDataClass2 = NoDataClassSample(name="yechan", age=22)
    val noDataClass3 = NoDataClassSample(name="minsu", age=19)

    // 데이터 값이 같아도 각각 메모리 할당
    println(noDataClass1.hashCode())
    println(noDataClass2.hashCode()) 
    println(noDataClass3.hashCode()) // 주소가 전부 다르다

}