class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        int n = arr.length;
        
        if(n<2)return;
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }   
            }
        }
    }
    void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}