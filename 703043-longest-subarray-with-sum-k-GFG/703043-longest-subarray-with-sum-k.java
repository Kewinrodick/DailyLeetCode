// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int n = arr.length;
        
        int max = 0;
        int sum = 0;
        
        for(int j=0;j<n;j++){
            sum+=arr[j];
            
            int check =  sum-k;
            
            if(map.containsKey(check)){
                max = Math.max(max,j-map.get(check));
            }
             if(!map.containsKey(sum))
            map.put(sum,j);
        }
        
        return max;
    }
}
