/**
 * Solution to 164. Maximum Gap problem
 * https://leetcode.com/problems/maximum-gap/
 */

class MaximumGap {
    fun maximumGap(nums: IntArray): Int {
        val nums = nums.sorted()
        var i = 0
        var maxDiff = 0
        while(i + 1 < nums.size) {
            var diff = nums[i + 1] - nums[i]
            if(diff > maxDiff) {
                maxDiff = diff
            }
            i++
        }
        return maxDiff
    }
}