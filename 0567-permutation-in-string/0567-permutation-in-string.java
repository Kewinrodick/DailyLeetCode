class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n>m) return false;

        HashMap<Character,Integer> s1Map = new HashMap<>();
        HashMap<Character,Integer> s2Map = new HashMap<>();

        for(int i= 0;i<n;i++){
            s1Map.put(s1.charAt(i),s1Map.getOrDefault(s1.charAt(i),0)+1);
            s2Map.put(s2.charAt(i),s2Map.getOrDefault(s2.charAt(i),0)+1);
        }
        if(s1Map.equals(s2Map)) return true;

        int i=0;   
        for(int j=n;j<m;j++){
           s2Map.put(s2.charAt(j),s2Map.getOrDefault(s2.charAt(j),0)+1);
           s2Map.put(s2.charAt(i),s2Map.getOrDefault(s2.charAt(i),0)-1);
           if(s2Map.get(s2.charAt(i))==0){
            s2Map.remove(s2.charAt(i));
           }
           i++;

           if(s1Map.equals(s2Map)) return true;
        }
        return false;
    }
}