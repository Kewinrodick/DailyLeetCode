class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if(tMap.containsKey(tc)){
                if(sc != tMap.get(tc)) return false;
            }
            if(sMap.containsKey(sc)){
                if(tc != sMap.get(sc)) return false;
            }
            sMap.put(sc,tc);
            tMap.put(tc,sc);
        }
        return true;
       
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna