/*
* �� �ƴ� �������� �Ѿ
* if��
* for��
* while��
* do while ���� ������
*
* when ��
* - ���� ���̽��� ���� �����ϱ� ���� ���
* - if�� ���� ���� ����Ҷ� ����
* - �����̳� ���� ���� ����
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
      randomA > randomB -> println("A�� �� ũ��")
      randomA < randomB -> println("A�� �� ũ��")
    }
 }