class Solution {
    public int findKthNumber(int m, int n, int k) {
        int l = 1;
        int h = m*n;

        while(l<=h){
            int mid = l + (h-l)/2;
            int pos = findPos(m,n,mid);

            if(pos >= k){
                h = mid-1;
            }
            else {
                l = mid + 1;
            }
            
            
        }
        return l;
    }
    int findPos(int m,int n,int mid){
        int s = 0;
        for(int i=1;i<=m;i++){
            s+=Math.min(mid/i,n);
        }
        return s;
    }
}