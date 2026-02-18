class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        int n = arr.length;
        
        if(n<2)return;
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[i]){
                    swap(arr,i,j);
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