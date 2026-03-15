class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0,i=0;
        
        for(int j=0;j<s.length();j++){
            
            while(map.containsKey(s.charAt(j))){
                 map.remove(s.charAt(i));
                 i++;
            }
            
            map.put(s.charAt(j), j);
            ans = Math.max(ans,(j-i)+1);
        }
        return ans;
    }
}