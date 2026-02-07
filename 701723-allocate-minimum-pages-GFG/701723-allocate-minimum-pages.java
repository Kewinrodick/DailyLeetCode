class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        
        if(k > n){
            return -1;
        }
        
        int l=0,h=0;
        
        for(int i:arr){
            l = Math.max(l,i);
            h+=i;
        }
        
        while(l<=h){
            int m = l+(h-l)/2;
            if(isPossible(arr,k,m)){
                h = m-1;
            }
            else{
                l=m+1;
            }
        }
        return h+1;
        
    }
    boolean isPossible(int[]arr,int k,int m){
        int c=1,last = 0;
        
        for(int i:arr){
            if(last+i <= m){
               last = last+i; 
            }
            else{
                c++;
                last = i;
            }
            
            if(c > k){
                return false;
            }
        }
        return true;
    }
}