class Solution {
    public int totalElements(int[] arr) {
        // code here
        int n = arr.length;

        if(n<2){
            return 0;
        }
        int c = 1;
        
        TreeMap<Integer,Integer> map =  new TreeMap<>();
        
        int max = Integer.MIN_VALUE;
        
        int i = 0;
       
        int j;

        for(j=0;j<n;j++){
            
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            
            
            if(map.size()>2){
                max = Math.max(max,j-i);
                while(map.size()>2){
                    map.put(arr[i],map.get(arr[i])-1);
                    if(map.get(arr[i]) == 0){
                        map.remove(arr[i]);
                    }
                    i++;
                }
            }
        }
        
        max = Math.max(max,j-i);
        
        return max;
    }
}