class Solution {
    public boolean isPossible(int[] nums) {
        // [1,2,3,3,4,4,5,5]
        // {1:1,2:1,3:2,4:2,5:2}
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashMap<Integer,Integer> needed = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            if(map.get(nums[i]) > 0){
                
                if(needed.getOrDefault(curr,0)>0){
                    map.put(curr,map.get(curr)-1);
                    needed.put(curr,needed.getOrDefault(curr,0)-1);

                    needed.put(curr+1,needed.getOrDefault(curr+1,0)+1);
                }
                // create a new split
                else if(map.getOrDefault(curr,0)>0 && map.getOrDefault(curr+1,0)>0 
                        && map.getOrDefault(curr+2,0)>0){

                        map.put(curr,map.getOrDefault(curr,0)-1);
                        map.put(curr+1,map.getOrDefault(curr+1,0)-1);
                        map.put(curr+2,map.getOrDefault(curr+2,0)-1);

                        needed.put(curr+3,needed.getOrDefault(curr+3,0)+1);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna