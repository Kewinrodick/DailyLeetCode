class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n>m) return false;

        char[] checkArr = s1.toCharArray();
        Arrays.sort(checkArr);

        String sortS1 = new String(checkArr);

        int i = 0;
        for(int j=0;j<m;j++){
            if(j-i+1 == n){
                String currStr = s2.substring(i,j+1);
                char[] checkS2 = currStr.toCharArray();
                Arrays.sort(checkS2);
                String sortS2 = new String(checkS2);
                if(sortS1.equals(sortS2)){
                    return true;
                }
                else{
                    i++;
                }
            }
        }
        return false;
    }
}