class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for(int i:nums){
            set.add(i);
        }

        int res = 0;
        int c = 0;
        for(int i:set){
            if(!set.contains(i-1)){
                c=0;
                int k = i;
                while(set.contains(k)){
                    c++;
                    k++;
                }
            }
            res = Math.max(res,c);
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna