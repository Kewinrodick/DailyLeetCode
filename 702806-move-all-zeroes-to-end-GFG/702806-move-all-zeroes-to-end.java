class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n = arr.length;
        
        int c = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                arr[c] = arr[i];
                
                c++;
            }
        }
        
        while(c<n){
            arr[c++] = 0;
        }
        
        return;
    }
}