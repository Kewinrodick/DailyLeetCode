class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        // map.put(-1,0);
        //arr[] = [10, 2, -2, -20, 10], k = -10
        int ps = 0;
        int res = 0;
        
        for(int j=0;j<n;j++){
            
             ps +=arr[j];
            
            if(map.containsKey(ps-k)){
                res+=map.get(ps-k);
            }
            if(ps == k){
                res+=1;
            }
            
            map.put(ps,map.getOrDefault(ps,0)+1);
            
        }
        return res;
        
    }
}