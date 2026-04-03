// User function Template for Java

class Solution {
    int longestUniqueSubstring(String s) {
        // code here
        HashSet<Character> set = new HashSet<>();
        
        int maxLen = 0;
        
        int i=0;
        for(int j=0;j<s.length();j++){
            
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            
            set.add(s.charAt(j));
            
            maxLen = Math.max(j-i+1,maxLen);
        }
        
        return maxLen;
    }
}