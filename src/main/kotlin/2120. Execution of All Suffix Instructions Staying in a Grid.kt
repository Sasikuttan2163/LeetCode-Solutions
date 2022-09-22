/**
 * Solution to 2120. Execution of All Suffix Instructions Staying in a Grid
 * https://leetcode.com/problems/execution-of-all-suffix-instructions-staying-in-a-grid/
 */
public open class RobotGrid {
    fun executeInstructions(n: Int, startPos: IntArray, s: String): IntArray {
        val l = s.length
        val arr = IntArray(l)
        var k = 0
        while(k < l) {
            val strim = s.substring(k)
            val pos = startPos.clone()
            var i = 0
            while (i < l - k) {
                when (strim[i]) {
                    'R' -> pos[1]++
                    'L' -> pos[1]--
                    'U' -> pos[0]--
                    'D' -> pos[0]++
                }
                if (pos.any { c -> c >= n || c < 0 }) {
                    break
                }
                arr[k]++
                i++
            }
            k++
        }
        return arr
    }

}