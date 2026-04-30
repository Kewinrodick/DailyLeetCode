class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int[] min = new int[n];
        for (int i = 0; i < n; i++) {
            int a = nums[i];
            if (a > 0 && a <= n)
                min[a - 1] = a;
        }
        for (int i = 0; i < n; i++) {
            if (min[i] != i + 1) {

                return i + 1;

            }
        }
        return n + 1;

    }
}