class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer = mutableListOf<Int>()
        var maps = mutableMapOf<String, Int>()
        for (idx in name.indices) {
            maps.put(name[idx], yearning[idx])
        }
        photo.forEach { array ->
            var sum = 0
            array.forEach {
                sum += maps.get(it) ?: 0
            }
            answer.add(sum)
        }
        return answer.toIntArray()
    }
}

fun main() {
    var a = Solution()

    a.solution(
        arrayOf("may", "kein", "kain", "radi"), intArrayOf(5, 10, 1, 3),
        arrayOf(
            arrayOf("may", "kein", "kain", "radi"),
            arrayOf("may", "kein", "brin", "deny"),
            arrayOf("kon", "kain", "may", "coni")
        )
    )//19,15,6
    a.solution(
        arrayOf("kali", "mari", "don"), intArrayOf(11, 1, 55),
        arrayOf(
            arrayOf("kali", "mari", "don"),
            arrayOf("pony", "tom", "teddy"),
            arrayOf("con", "mona", "don")
        )
    )//67,0,55
    a.solution(
        arrayOf("may", "kein", "kain", "radi"), intArrayOf(5, 10, 1, 3), arrayOf(
            arrayOf("may"),
            arrayOf("kein", "deny", "may"),
            arrayOf("kon", "coni")
        )
    )//5,15,0

}