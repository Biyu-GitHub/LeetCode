class Solution {

    // TODO 40%
    fun rotate(matrix: Array<IntArray>): Unit {
        val m = matrix.size
        val n = matrix[0].size

        val aux: Array<IntArray> = Array(m) { IntArray(n) }

        for (i in matrix.indices) {
            for (j in matrix[0].indices) {
                aux[i][j] = matrix[i][j]
            }
        }

        for (i in matrix.indices) {
            for (j in matrix[0].indices) {
                matrix[i][j] = aux[j][i]
            }
        }

        for (i in matrix.indices) {
            reverse(matrix[i])
        }
    }

    fun reverse(array: IntArray) {
        var i = 0
        var j = array.size - 1

        while (i < j) {
            val temp = array[i]
            array[i] = array[j]
            array[j] = temp
            i++
            j--
        }
    }
}