class Solution {
    fun maxSubArray(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }
        var res = nums[0]
        var sum = 0

        for (i in nums.indices) {
            if (sum > 0)
                sum += nums[i]
            else
                sum = nums[i]
            res = res.coerceAtLeast(sum)
        }

        return res
    }
}