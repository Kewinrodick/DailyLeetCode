class Solution {
    public static String minWindow(String s, String p) {
        // code here
        int l1 = s.length();
        int l2 = p.length();
        
        if(l1 < l2) return "";
        
        if((l1 == 1 && l2 == 1 )&& !s.equals(p))return "";
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char i: p.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int c = 0;
        int st = -1;
        int minLen = Integer.MAX_VALUE;
        
        int i = 0;
        for(int j=0;j<l1;j++){
            char curr = s.charAt(j);
            
            if(map.containsKey(curr)){
                if(map.get(curr) > 0) c++;
            }
            
            map.put(curr,map.getOrDefault(curr,0)-1);
          
            while(c == l2){
                char stChar = s.charAt(i);
                map.put(stChar,map.get(stChar)+1);
                if(map.get(stChar) > 0){
                    c--;
                }
                if(minLen > j-i+1){
                    minLen = j-i+1;
                    st = i;
                }
                i++;
            }
            
        }
        
        if(st == -1)return "";
        return s.substring(st,st+minLen);
        
        
    }
}