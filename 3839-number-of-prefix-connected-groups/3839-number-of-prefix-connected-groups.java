class Solution {
    public int prefixConnected(String[] words, int k) {
        int n = words.length;
        
        int ans = 0;
        HashMap<String,Integer> map = new HashMap<>();

        for(String s:words){
            if(s.length() >= k){
                String pref = s.substring(0,k);
                map.put(pref,map.getOrDefault(pref,0)+1);
            }
        }
        int c = 0;
        // for(Map.Entry<String,Integer> set : map.entrySet()){
        //     System.out.println(set.getKey()+":"+set.getValue());
        // }
        for(int value:map.values()){
            if(value >= 2){
                c++;
            }
        }
        return c;
    }
}