class Solution {
     
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i:nums){
            set.add(i);
        }
        int c = 0;
        int res = 0;
        for(int i:set){
            c = 0;
            if(!set.contains(i-1)){
                int n = i;
                while(set.contains(n)){
                    c++;
                    n++;
                }
            }
            res = Math.max(res,c);
        }
        return res;
    }
}