class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
     
        
        for(int i=0;i<arr.length;i++){
            int check = target - arr[i];
            
            if(map.containsKey(check)){
                return true;
            }
            else
            map.put(arr[i],check);
        }
        return false;
    }
}