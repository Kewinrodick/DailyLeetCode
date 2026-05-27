class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        //[3,4,3,0,-5,2,3] k=3
        //{0:2,1:2,2:1}
        //c=4

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int c = 0;
        int ps = 0;
        for(int i:nums){
            ps+=i;
            int r = ((ps%k)+k)%k;
            c+=map.getOrDefault(r,0);
            map.put(r,map.getOrDefault(r,0)+1);
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna