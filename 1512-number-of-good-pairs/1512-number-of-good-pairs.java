class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int ans = 0;

        for(int val:map.values()){
            ans+=(val * (val-1))/2;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna