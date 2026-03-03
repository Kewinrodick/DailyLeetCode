class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int l = 0,r=n-1,c=0;
        
        int lmax = 0,rmax=0;
        
        while(l<r){
            
            if(arr[l]<=arr[r]){
                lmax = Math.max(lmax,arr[l]);
                c+=lmax - arr[l];
                l++;
            }
            else{
                rmax = Math.max(rmax,arr[r]);
                c+=rmax - arr[r];
                r--;
            }
        }  
        
        return c;
    }
}
