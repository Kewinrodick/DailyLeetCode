class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        if(k == 1){
            int max = 0;
            for(int i:arr){
                max = Math.max(max,i);
            }
            return max;
        }
        
        int i = 0;
        int res = 0;
        int curr = arr[0];
        
        
        
        for(int j=1;j<n;j++){
            curr^=arr[j];
      
            if(j-i+1 == k){
                res = Math.max(res,curr);
                curr ^= arr[i];
                i++;
    
            }
            
        }
        return res;
    }
}
