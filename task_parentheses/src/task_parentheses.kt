class Solution {
    fun isValid(s: String): Boolean {
        var st:String=s
        while  (st.contains("()")||st.contains("{}")||st.contains("[]")) {
            val x = st.find { it == '(' }
            val y = st.find { it == ')' }
            if (x != null && y != null) {
                if (st.indexOf(y) == st.indexOf(x) + 1) {
                    st = st.removeRange(st.indexOf(x)..st.indexOf(y))
                }
            }
            val q = st.find { it == '[' }
            val w = st.find { it == ']' }
            if (q != null && w != null) {
                if (st.indexOf(w) == st.indexOf(q) + 1) {
                    st = st.removeRange(st.indexOf(q)..st.indexOf(w))
                }
            }
            val e = st.find { it == '{' }
            val r = st.find { it == '}' }

            if (e != null && r != null) {
                if (st.indexOf(r) == st.indexOf(e) + 1) {
                    st = st.removeRange(st.indexOf(e)..st.indexOf(r))
                }
            }
        }
        return st.isEmpty()
    }
}

fun main(){
    val s="(){}()()"
    println()
    println(Solution().isValid(s))
}
