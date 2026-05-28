class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double avg = (double) sum / k;
    
        for (int i = k; i < nums.length; i++) {

            sum += nums[i];
            sum -= nums[i - k];

            avg = Math.max(avg, (double) sum / k);
        }
        return avg;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna