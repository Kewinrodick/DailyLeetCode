class Solution {
    public void dfs(int index,List<List<Integer>> ans,List<Integer> lst,int[] arr,int target){
        if(target == 0 ){
            ans.add(new ArrayList<>(lst));
            return;
        }
        if(target < 0) return;

        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i] == arr[i-1])continue;
            lst.add(arr[i]);
            dfs(i+1,ans,lst,arr,target-arr[i]);
            lst.remove(lst.size()-1);   
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> lst = new ArrayList<>();

        Arrays.sort(candidates);
        dfs(0,ans,lst,candidates,target);   

        return ans;
    }
}