    val list= mutableListOf(0,1)
    var ind=0
    fun fib(n: Int): Int {
        val next=list[ind]+list[ind+1]
        if (n>ind){
            ind++
            list.add(next)
            fib(n)
        }
        return list[n]
    }

    fun main(){
        fib(1)
    }