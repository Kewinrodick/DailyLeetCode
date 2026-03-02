class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i:arr){
            set.add(i);
        }
        int res = 0;
        for(int i:arr){
            if(set.contains(i) && !set.contains(i-1)){
                
                int cnt = 0;
                int curr = i;
                while(set.contains(curr)){
                    //set.remove(curr);
                    curr++;
                    cnt++;
                }
                
                res = Math.max(res,cnt);
            }
        }
        
        return res;
        
    }
}