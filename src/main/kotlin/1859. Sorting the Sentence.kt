/**
 * Solution of 1859. Sorting the Sentence
 * https://leetcode.com/problems/sorting-the-sentence/
 */

import kotlin.math.pow

class SortSentence {
    fun sortSentence(s: String): String {
        var words = s.split(" ")
        var result = ""
        words = words.sortedBy {
            var i = 0
            var pow = 0
            while(it[it.length - pow - 1].isDigit()) {
                i += 10.0.pow(pow.toDouble()).toInt() * (it[it.length - pow - 1].digitToInt() - 49)
                pow++
            }
            i
        }
        words.stream()
            .map { it.substring(0, it.length - 1) + " " }
            .forEach {
                result += it
            }
        return result.trim()
    }
}