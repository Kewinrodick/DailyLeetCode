class Solution {
    public int splitArray(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        int l = Integer.MIN_VALUE ,h=0;
        
        for(int i: arr){
            l = Math.max(l,i);
            h +=i;
        }
        
        while(l <= h){
            int m = l + (h-l)/2;
            if(isPossible(arr,k,m)){
                h=m-1;
            }
            else{
                l=m+1;
            }
            
        }
        return h+1;
    }
    
    boolean isPossible(int[] arr,int k,int m){
        int c = 1, lsum = 0;
        
        for(int i:arr){
            if(lsum + i <= m){
                lsum+=i;
            }
            else{
               
                    c++;
                    lsum = i;
                
            }
            
            if(c > k){
                return false;
            }
        }
        
        return true;
    }
};