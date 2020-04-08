internal class SolutionKT {

    private lateinit var visited: Array<BooleanArray>
    private var res = 0

    fun movingCount(m: Int, n: Int, k: Int): Int {
        visited = Array(m) { BooleanArray(n) }
        movingCount(0, 0, m, n, k)
        return res
    }

    private fun movingCount(i: Int, j: Int, m: Int, n: Int, k: Int) {
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j] || sumDigit(i) + sumDigit(j) > k) {
            return
        }
        visited[i][j] = true
        res++
        movingCount(i + 1, j, m, n, k)
        movingCount(i - 1, j, m, n, k)
        movingCount(i, j + 1, m, n, k)
        movingCount(i, j - 1, m, n, k)
    }

    private fun sumDigit(n: Int): Int {
        var n = n
        var sum = 0
        while (n > 0) {
            sum += n % 10
            n /= 10
        }
        return sum
    }
}