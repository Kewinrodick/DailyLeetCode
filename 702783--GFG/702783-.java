// User function Template for Java

class Solution {

    long countSubarray(int arr[], int n, int k) {

        // code here
        long c = 0;
        long pos = 0;
        
        for(int i=0;i<n;i++){
            if(arr[i] > k){
                pos=i+1;
            }
            c+=pos;
        }
        
        return c;
    }
}