class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        
        for(int j=0;j<n-1;j++){
            int max = 0;
            for(int i=0;i<n-j;i++){
                if(arr[max] < arr[i]){
                    max = i;
                }
            }
            swap(arr,max,n-j-1);
        }
    }
    void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}