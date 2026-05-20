class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<>();

       for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if(map.containsKey(n)){
                int diff = Math.abs(map.get(n)-i);
                if(diff <= k)return true;
            }
                map.put(n,i);
            
       } 
       return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna