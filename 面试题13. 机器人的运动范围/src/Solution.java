class Solution {

    private boolean[][] visited;
    private int res;

    public int movingCount(int m, int n, int k) {
        visited = new boolean[m][n];
        res = 0;
        movingCount(0, 0, m, n, k);
        return res;
    }

    private void movingCount(int i, int j, int m, int n, int k) {

        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j] || sumDigit(i) + sumDigit(j) > k) {
            return;
        }
        visited[i][j] = true;
        res++;
        movingCount(i + 1, j, m, n, k);
        movingCount(i - 1, j, m, n, k);
        movingCount(i, j + 1, m, n, k);
        movingCount(i, j - 1, m, n, k);
    }

    private int sumDigit(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }

}