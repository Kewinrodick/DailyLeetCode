class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;

        if(n<=2) return nums;

        int xor = 0;
        for(int i:nums){
            xor^=i;
        }
        int diff = xor & (-xor);

        int l=0,r=0;
        for(int i:nums){
            if((i&diff) == 0){
                l^=i;
            }
            else{
                r^=i;
            }
        }

        return new int[]{l,r};

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna