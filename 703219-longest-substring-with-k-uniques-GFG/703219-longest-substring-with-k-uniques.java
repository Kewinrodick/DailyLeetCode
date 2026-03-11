class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int n = s.length();
        
        HashMap<Character,Integer> map = new HashMap<>();
        int max = -1;
        int i = 0;
        for(int j=0;j<n;j++){
            
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            if(map.size() == k){
                max = Math.max(max, j-i+1);
            }
            while(map.size() > k){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i)) == 0){
                        map.remove(s.charAt(i));
                    }
                    i++;
            }
            
        }
        return max;
    }
}