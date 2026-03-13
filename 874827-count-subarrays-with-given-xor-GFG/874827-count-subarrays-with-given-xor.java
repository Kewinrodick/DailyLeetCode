class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int pXor = 0;
        int c = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i:arr){
            pXor^=i;
            
            int need = pXor^k;
            
            if(map.containsKey(need)){
                c+=map.get(need);
            }
            map.put(pXor,map.getOrDefault(pXor,0)+1);
        }
        
        return c;
    }
}