//����� ��������� , ������ ������������ F(n)��� �����,
//�������� ������������������, ����������
//������������������� ��������� , ��� ��� ������ �����
//�������� ������ ���� ����������, ������� � 0 � 1.
//�� ����,
//F(0) = 0, F(1) = 1
//F(n) = F(n - 1) + F(n - 2), ��� n > 1.
//���� n, ��������� F(n).
val list = mutableListOf(0, 1)
var ind = 0
fun fib(n: Int): Int {
    val next = list[ind] + list[ind + 1]
    if (n > ind) {
        ind++
        list.add(next)
        fib(n)
    }
    return list[n]
}

fun main() {
    println(fib(4))
}