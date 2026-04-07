
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,0);
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(!map.containsKey(sum))
                map.put(sum,i+1);
            
            if(map.containsKey(sum - target)){
                return new ArrayList<>(Arrays.asList(map.get(sum - target)+1 , i+1));
            }
            
        }
        
        return new ArrayList<>(Arrays.asList(-1));
    }
}
