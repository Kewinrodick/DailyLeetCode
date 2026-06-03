class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> minq = new ArrayDeque<>();
        Deque<Integer> maxq = new ArrayDeque<>();

        int i = 0;
        int j = 0;
        for( j=0;j<nums.length;j++){
            
            while(!minq.isEmpty() && minq.peekLast() > nums[j]) minq.pollLast();
            while(!maxq.isEmpty() && maxq.peekLast() < nums[j]) maxq.pollLast();

            minq.offerLast(nums[j]);
            maxq.offerLast(nums[j]);

            if(maxq.peekFirst() - minq.peekFirst() > limit){
                if(minq.peekFirst() == nums[i]) minq.pollFirst();
                if(maxq.peekFirst() == nums[i]) maxq.pollFirst();

                i++;
            }
        }

        return j-i;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna