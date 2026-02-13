class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        int n=nums.length;

        Arrays.sort(nums);

        int h = nums[n - 1] - nums[0];
        int l = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[i - 1] < l)
                l = nums[i] - nums[i - 1];
        }

        while (l <= h) {
            int m = l + (h - l) / 2;
            if (countPairs(nums, m) < k) {
                l = m + 1;
            } else {
                h = m - 1;
            }

        }
        return l;
    }

    int countPairs(int[] arr, int diff) {
        int j = 0;
        int count = 0, n = arr.length;
        for (int i = 1; i < n; i++) {
            while (arr[i] - arr[j] > diff)
                j++;
            count += i - j;
        }
        return count;
    }
}