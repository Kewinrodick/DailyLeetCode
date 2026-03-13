class Solution {
    public int subarraySum(int[] arr) {
        // code here
        
        int n = arr.length;
        
        int sum = 0;
        
        for(int i=0;i<n;i++){
            sum+=(i+1)*(n-i)*arr[i];
        }
        return sum;
        
    }
}
