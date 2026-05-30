class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int l = 0, r = 0;

        long max = 0;
        long sum = 0;

        HashSet<Integer> set = new HashSet<>();

        while (l < n && r < n) {

            while (set.contains(nums[r])) {

                sum -= nums[l];
                set.remove(nums[l]);
                l++;
            }
            set.add(nums[r]);
            sum += nums[r];
            r++;

            if (r - l >= k) {
                max = Math.max(max, sum);
                sum -= nums[l];
                set.remove(nums[l]);
                l++;
            }

        }
        return max;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna