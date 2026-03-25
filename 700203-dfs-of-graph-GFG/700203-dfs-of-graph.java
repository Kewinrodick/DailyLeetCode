class Solution {
    public void traverse(int node,Queue<Integer> queue,int[] visited,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans){
         visited[node] = 1;
         queue.offer(node);
         
         while(!queue.isEmpty()){
            int curr = queue.poll();
            ans.add(curr);
            for(int i:adj.get(curr)){
                if(visited[i] != 1){
                    traverse(i,queue,visited,adj,ans);
                }
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        Queue<Integer> queue = new LinkedList<>();
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int[] visited = new int[adj.size()];
        
        traverse(0,queue,visited,adj,ans);
        
        return ans;
       
        
    }
}