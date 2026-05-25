class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);
        //[-4,-1,-1,0,1,2]

        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            int l = i+1;
            int r = n-1;

            while(l<r){
                int sum = nums[l] + nums[r] + nums[i];

                if(sum > 0) r--;
                else if(sum < 0) l++;

                else{
                    set.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));
                    r--;
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(List<Integer> i:set){
            ans.add(i);
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna