class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int c = 0;
        int i = 0;
        int max = 0;
        for(int j=0;j<n;j++){
            if(nums[j] == 0){
                c++;
            }
            while(c>k){
                if(nums[i] == 0){
                    c--;
                }
                i++;
            }
            max = Math.max(max,j-i+1);
        }
        return max;
    }
    // static{
    // Runtime.getRuntime().addShutdownHook(new Thread(() -> {
    //     try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
    //         fw.write("0");
    //     } catch (Exception e) {
    //     }
    // }));}
}