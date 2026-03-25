class Solution {
    public void traverse(int node,int[] visited,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans){
         visited[node] = 1;
         ans.add(node);
         
         
            for(int i:adj.get(node)){
                if(visited[i] != 1){
                    traverse(i,visited,adj,ans);
                }
            }
        
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int[] visited = new int[adj.size()];
        
        traverse(0,visited,adj,ans);
        
        return ans;
       
        
    }
}