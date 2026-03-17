class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = fruits.length;
        int max = 1;
        int i = 0;
        for(int j=0;j<n;j++){
            
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            
            while(map.size()>2){
                map.put(fruits[i],map.get(fruits[i])-1);
                if(map.get(fruits[i]) <= 0){
                    map.remove(fruits[i]);
                }
                i++;
            }

           max = Math.max(max,j-i+1);
        }

        return max;

    }
}