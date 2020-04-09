class Solution {

    fun reverseLeftWords(s: String, n: Int): String {
        if (s.isEmpty()) {
            return s
        }

        val chars = s.toCharArray()
        reverse(chars, 0, chars.size - 1)
        reverse(chars, chars.size - n, chars.size - 1)
        reverse(chars, 0, chars.size - n - 1)

        return String(chars)
    }

    private fun reverse(chars: CharArray, l: Int, r: Int) {
        var i = l
        var j = r
        while (i < j) {
            val temp = chars[i]
            chars[i] = chars[j]
            chars[j] = temp
            i++
            j--
        }
    }
}