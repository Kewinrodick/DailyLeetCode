class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        StringBuilder s = new StringBuilder();
        HashMap<Character,Character> map = new HashMap<>();
        
        
        for(int i=0;i<s1.length();i++){
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            if(!map.containsKey(a) && !map.containsValue(b)){
                map.put(a,b);
                s.append(b);
            }
            else{
                s.append(map.get(a));
            }
        }
        //  System.out.print(s.toString());
        return s2.equals(s.toString());
    }
}