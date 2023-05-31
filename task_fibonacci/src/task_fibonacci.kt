//Числа Фибоначчи , обычно обозначаемые F(n)как числа,
//образуют последовательность, называемую
//последовательностью Фибоначчи , так что каждое число
//является суммой двух предыдущих, начиная с 0 и 1.
//То есть,
//F(0) = 0, F(1) = 1
//F(n) = F(n - 1) + F(n - 2), для n > 1.
//Дано n, вычислить F(n).
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