class Solution {
    fun findCenter(edges: Array<IntArray>): Int {
        val res= if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]){
            edges[0][0]
        }
        else edges[0][1]
        return res
    }
}
fun main(){
    val c: Array<IntArray> = arrayOf(intArrayOf(1,2), intArrayOf(5,1), intArrayOf(1,3), intArrayOf(1,4))
    println( Solution().findCenter(c))
}