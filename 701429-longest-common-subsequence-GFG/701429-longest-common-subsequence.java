class Solution {
    static int helper(String s1,String s2,int i,int j,Integer[][] dp){
        if(i<0 || j<0)return 0;
        
        if(dp[i][j] !=  null) return dp[i][j];
        
        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = (int) 1+helper(s1,s2,i-1,j-1,dp);
        }
        
        
        return dp[i][j] = (int) Math.max(helper(s1,s2,i-1,j,dp) , helper(s1,s2,i,j-1,dp));
        
    }
    static int lcs(String s1, String s2) {
        // code here
        
        // iterative tabulation approach TC:O(n*m), SC:O(n*m)
        
        int n = s1.length();
        int m = s2.length();
        
        Integer[][] dp = new Integer[n+1][m+1];
        
        // for(int i=1;i<=n;i++){
            
        //     for(int j=1;j<=m;j++){
                
        //         if(s1.charAt(i-1) == s2.charAt(j-1)){
        //             dp[i][j] = 1+dp[i-1][j-1];
        //         }
        //         else{
        //             dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
        //         }
        //     }
        // }
        
        // return dp[n][m];
        
        
        return helper(s1,s2,n-1,m-1,dp);
    }
}