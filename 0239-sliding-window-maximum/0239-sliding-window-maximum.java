class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> q = new ArrayDeque<>();
        ArrayList<Integer> ls = new ArrayList<>();

        int i=0;

        for(int j=0;j<nums.length;j++){
            while(!q.isEmpty() && q.peekLast() < nums[j]){
                q.pollLast();
            }
            q.offerLast(nums[j]);

            if(j-i+1 == k){
                ls.add(q.peekFirst());
                if(nums[i] == q.peekFirst()){
                    q.pollFirst();
                }
                i++;
            }
        }

         int[] ans = new int[ls.size()];

        for(int p=0;p<ans.length;p++){
            ans[p] = ls.get(p);
        }

        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna