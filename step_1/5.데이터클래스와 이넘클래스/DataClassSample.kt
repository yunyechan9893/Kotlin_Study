data class DataClassSample(val name:String, val age:Int)

class NoDataClassSample(val name:String, val age:Int)


fun main(){
    val dataClass1 = DataClassSample(name="minsu", age=19)
    val dataClass2 = DataClassSample(name="yechan", age=22)
    val dataClass3 = DataClassSample(name="yechan", age=22)

    // ������ ���� ������ ���� �ؽ��ڵ尪�� ����
    println(dataClass1.hashCode())
    println(dataClass2.hashCode()) // dataClass1, dataClass2�� �ٸ���
    println(dataClass3.hashCode()) // dataClass2, dataClass3�� ����

    println("name : ${dataClass1.component1()}") // ������ Ŭ���� ù��° ���ڰ��� ������
    println("age : ${dataClass1.component2()}")

    val (name, age) = dataClass2
    println("$name, $age")

    val dataClass4 = dataClass3.copy()
    val dataClass5 = dataClass3.copy(name="jiwon") // ī�ǽÿ��� ���ڰ��� ������ �� �ִ�

    println(dataClass4==dataClass3) // ī�ǽÿ��� �ؽð��� ����
    println(dataClass4)
    println(dataClass5)
    
    val noDataClass1 = NoDataClassSample(name="minsu", age=19)
    val noDataClass2 = NoDataClassSample(name="yechan", age=22)
    val noDataClass3 = NoDataClassSample(name="minsu", age=19)

    // ������ ���� ���Ƶ� ���� �޸� �Ҵ�
    println(noDataClass1.hashCode())
    println(noDataClass2.hashCode()) 
    println(noDataClass3.hashCode()) // �ּҰ� ���� �ٸ���

}