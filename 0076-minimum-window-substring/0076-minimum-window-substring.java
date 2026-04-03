class Solution {
    public String minWindow(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();

        if(l2 > l1) return "";
    
        if(l1 == 1 && l2 == 1 && !s.equals(t))return ""; 

        HashMap<Character,Integer> map = new HashMap<>();

        for(char i :t.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int minLen = Integer.MAX_VALUE;
        int start = -1;
        int c = 0;
        int i=0;
        for(int j=0;j<l1;j++){
            char curr = s.charAt(j);
            if(map.containsKey(curr)){
                if(map.get(curr) > 0){
                    c++;
                }
            }
            map.put(curr,map.getOrDefault(curr,0)-1);
     
            while(c == l2){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
                if(map.get(s.charAt(i)) > 0){
                    c--;
                }
                if(minLen > j-i+1){
                    minLen = j-i+1;
                    start = i;
                }
                i++;
            }
        }
        if(start == -1)return "";
        return s.substring(start,start+minLen);

    }
}