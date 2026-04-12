class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;

        if (n == 1) return 1;

        int i=0,j=0,c=0;

        while(j<n && i<n){
            if(nums[i] == nums[j]){
                j++;
                continue;
            }
            else{
                nums[++i] = nums[j];
                c++;
            }
        }
        return ++c;
    }
}