/*
* # �Լ� �⺻����
**
* fun �Լ���(����:Ÿ��, ����:Ÿ��) : return Ÿ��{
* return ��
* }
**
*
* # �Ķ���� �⺻�� ��� ����
**
* fun �Լ���(����:Ÿ��=�⺻��, ����:Ÿ��=�⺻��) : return Ÿ��{
* return ��
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

// ���̽��� ���� ����ϴٺ��� Ÿ������ �ϴ°��� ���� ������
fun divide_with_three(a:Int, b:Int=3){
    println(a+b)
}

fun multi(a:Int, b:Int) = a*b