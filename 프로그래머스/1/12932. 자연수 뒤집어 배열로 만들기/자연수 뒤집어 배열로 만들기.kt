class Solution {
    fun solution(n: Long): IntArray =
            n.toString().reversed().map{e->e.toString().toInt()}.toIntArray()
}