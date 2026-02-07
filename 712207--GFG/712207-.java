class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        
        int l = 1;
        int h = stalls[n-1]-stalls[0];
        
        while(l<=h){
            int m = l+(h-l)/2;
            if(isPossible(stalls,k,m)){
                l = m+1;
            }
            else{
                h = m-1;
            }
        }
        return h;
    }
    boolean isPossible(int[] stalls,int k,int m){
        int start = stalls[0],c = 1;
        for(int i=1;i<stalls.length;i++){
            if(stalls[i] - start  >= m){
                start = stalls[i];
                c++;
            }
            if(c>=k){
                return true;
            }
        }
        return false;
    }
    
}