class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder ans = new StringBuilder();
        
            for(int i=0;i<strs[0].length();i++){
                char check = strs[0].charAt(i);
                for(int j=1;j<strs.length;j++){
                    if(strs[j].charAt(i) != check){
                        return ans.toString();
                    }
                }
                ans.append(check);
            }
            return ans.toString();
    }
}