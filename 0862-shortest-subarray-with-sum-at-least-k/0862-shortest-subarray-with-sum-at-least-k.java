class Solution {
    public int shortestSubarray(int[] nums, int k) {
        Deque<long[]> q = new ArrayDeque<>();

        int n = nums.length;
        long sum = 0;
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            sum += nums[i];

            if(sum >= k){
                ans = Math.min(ans, i + 1);
            }

            while(!q.isEmpty() && sum - q.peekFirst()[1] >= k){
                ans = Math.min(ans, i - (int)q.pollFirst()[0]);
            }

            while(!q.isEmpty() && sum <= q.peekLast()[1]){
                q.pollLast();
            }

            q.offerLast(new long[]{i, sum});
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}