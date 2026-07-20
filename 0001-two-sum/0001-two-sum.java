class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i=0;i<nums.length;i++){
            int check = target - nums[i];
            if(map.containsKey(check)){
                ans[0]=i;ans[1]=map.get(check);
                return ans;
            }
            map.put(nums[i],i);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna