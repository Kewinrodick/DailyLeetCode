class Solution {
    // public int findMin(int[] arr){
    //     int min = Integer.MAX_VALUE;
    //     for(int i:arr){
    //         min = Math.min(min,i);
    //     }
    //     return min;
    // }
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int c = 0;
        int[] lastSeen = new int[3];
        Arrays.fill(lastSeen,-1);

        for(int i=0;i<n;i++){
            lastSeen[s.charAt(i) - 'a'] = i;

            if(lastSeen[0]!=-1 && lastSeen[1]!=-1 && lastSeen[2]!=-1){
                int minInd = Math.min(lastSeen[0],Math.min(lastSeen[1],lastSeen[2]));
                c=c+minInd+1;
            }
        }
        
        return c;
    }
}