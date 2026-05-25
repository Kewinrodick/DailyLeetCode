class Solution {
    public int numSplits(String s) {

        if(s.length() == 1)return 1;

        HashMap<Character,Integer> sLeft = new HashMap<>();
        HashMap<Character,Integer> sRight = new HashMap<>();

        sLeft.put(s.charAt(0),sLeft.getOrDefault(s.charAt(0),0)+1);

        for(int i=1;i<s.length();i++){
             sRight.put(s.charAt(i),sRight.getOrDefault(s.charAt(i),0)+1);
        }

        //{a:1}, {a:3, c:1, b:1}
        int c = 0;

        if(sLeft.size() == sRight.size())c++;
        for(int i=1;i<s.length();i++){
            char curr = s.charAt(i);

            if(sRight.containsKey(curr)){
                sRight.put(curr,sRight.get(curr)-1);
                if(sRight.get(curr) == 0) sRight.remove(curr);
            }
            sLeft.put(curr,sLeft.getOrDefault(curr,0)+1);

            if(sLeft.size() == sRight.size())c++;
        }

       return c;
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna