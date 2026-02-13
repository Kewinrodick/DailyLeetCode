// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        int ans = Integer.MIN_VALUE;
        // code here
        
            for(int i=2;i<=n;i++){
               while(n%i == 0 && n>0){
                   ans = Math.max(i,ans);
                   n/=i;
               }
            }
        
        
        return ans;
    }
    
}