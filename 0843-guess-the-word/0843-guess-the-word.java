/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
class Solution {
    public void findSecretWord(String[] words, Master master) {
        Random rand = new Random();
        int n = words.length;
        ArrayList<String> wordsCopy = new ArrayList<>(Arrays.asList(words));


        while(!wordsCopy.isEmpty()){
            int randInd = rand.nextInt(wordsCopy.size());
            String randWord = wordsCopy.get(randInd);

            int simC = master.guess(randWord);
            if(simC == 6) return;

            Iterator<String> it = wordsCopy.iterator();
            while(it.hasNext()){
                String curr = it.next();
                if(simC != getMatches(curr,randWord))
                    it.remove();
            }
        }                                       
    }
    public int getMatches(String a,String b){
        int c = 0;
        for(int i=0;i<6;i++){
            if(a.charAt(i) == b.charAt(i)) c++;
        }
        return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna