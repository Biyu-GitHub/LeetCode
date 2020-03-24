class Solution {
    public int massage(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        int[] aux = new int[n];

        aux[0] = nums[0];
        aux[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            aux[i] = Math.max(aux[i - 1], nums[i] + aux[i - 2]);
        }

        return aux[n - 1];
    }
}
