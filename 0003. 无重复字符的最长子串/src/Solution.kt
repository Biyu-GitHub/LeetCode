class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val set = hashSetOf<Char>()
        var l = 0
        var r = -1
        var ret = 0
        val n = s.length

        while (l < n) {
            if (r + 1 < n && s[r + 1] !in set) {
                set.add(s[++r])
                ret = ret.coerceAtLeast(set.size)
            } else {
                set.remove(s[l++])
            }
        }

        return ret
    }
}