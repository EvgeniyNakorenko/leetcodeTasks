
class Sort(val list1: List<Int?>?, val list2: List<Int?>?){

    fun addtolist(): MutableList<Int> {
        val list3: MutableList<Int> = mutableListOf()

        if (list1?.get(0) ==null && list2?.get(0) ==null) return list3
        else if (list1?.get(0) ==null) {
            for (el in list2!!.indices) {
                list3.add(list2[el]!!)
            }
            return list3
        }
        else if (list2?.get(0) ==null) {
            for (el in list1.indices) {
                list3.add(list1[el]!!)
            }
            return list3
        }
        else if (list1.size>list2.size){
            for (i in list2.indices){
                 if (list1[i]!! <= list2[i]!!) {
                    list3.add(list1[i]!!)
                    list3.add(list2[i]!!)
                } else if (list1[i]!! >= list2[i]!!) {
                    list3.add(list2[i]!!)
                    list3.add(list1[i]!!)
                }
            }
            for (i in list2.size until  list1.size){
                list3.add(list1[i]!!)
            }
            return list3
        }
        else if (list1.size<list2.size){
            for (i in list1.indices){
                if (list1[i]!! <= list2[i]!!) {
                    list3.add(list1[i]!!)
                    list3.add(list2[i]!!)
                } else if (list1[i]!! >= list2[i]!!) {
                    list3.add(list2[i]!!)
                    list3.add(list1[i]!!)
                }
            }
            for (i in list1.size until  list2.size){
                list3.add(list2[i]!!)
            }
            return list3
        }

        return list3
    }
}
fun main(){
    val list1= readLine()?.split(" ")?.toMutableList()?.map { it.toIntOrNull() }
    val list2= readLine()?.split(" ")?.toMutableList()?.map { it.toIntOrNull() }
    println(Sort(list1,list2).addtolist())
}