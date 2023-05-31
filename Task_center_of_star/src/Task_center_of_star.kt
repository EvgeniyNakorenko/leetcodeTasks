//»меетс€ неориентированный звездный граф, состо€щий из n узлов,
//помеченных от 1 до n.
//«вездный граф Ч это граф, в котором есть один центральный узел
//и ровно столько n - 1 ребер, которые соедин€ют центральный узел
//со всеми остальными узлами.
//
//¬ам дан двумерный целочисленный массив edges, каждый из которых
//указывает на наличие ребра между узлами и . ¬ернуть центр
//данного звездного графа.
class Solution {
    fun findCenter(edges: Array<IntArray>): Int {
        val res = if (
            edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            edges[0][0]
        } else edges[0][1]
        return res
    }
}

fun main() {
    val c: Array<IntArray> = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(5, 1),
        intArrayOf(1, 3),
        intArrayOf(1, 4)
    )
    println(Solution().findCenter(c))
}
