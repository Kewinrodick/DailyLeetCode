class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[27];

        int res = 0;
        int maxF = 0;
        
        int i=0;
        for(int j=0;j<s.length();j++){
            char curr = s.charAt(j);
            freq[curr - 'A']++;

            maxF = Math.max(freq[curr - 'A'],maxF);

            if(j-i+1 - maxF <= k){
                res = Math.max(res,j-i+1);
            }
            else{
                freq[s.charAt(i) - 'A']--;
                i++;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna