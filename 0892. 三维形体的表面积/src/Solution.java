class Solution {

    public int surfaceArea(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int res = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res += grid[i][j] * 6;
                if (grid[i][j] > 1) res -= (grid[i][j] - 1) * 2;
                if (i - 1 >= 0) res -= Math.min(grid[i][j], grid[i - 1][j]);
                if (i + 1 < m) res -= Math.min(grid[i][j], grid[i + 1][j]);
                if (j - 1 >= 0) res -= Math.min(grid[i][j], grid[i][j - 1]);
                if (j + 1 < m) res -= Math.min(grid[i][j], grid[i][j + 1]);
            }
        }

        return res;
    }
}