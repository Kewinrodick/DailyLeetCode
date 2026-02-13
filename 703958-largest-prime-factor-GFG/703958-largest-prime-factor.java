// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        int ans = Integer.MIN_VALUE;
        // code here
        
        while (n % 2 == 0) {
            ans = 2;
            n /= 2;
        }
        
        
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                ans = Math.max(ans,i);
                n /= i;
            }
        }

        
        if (n > 2)
            ans = Math.max(ans,n);

        
        return ans;
    }
    
}