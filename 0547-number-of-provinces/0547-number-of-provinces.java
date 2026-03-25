class Solution {
    public void dfs(int node,int[] visited,ArrayList<ArrayList<Integer>> adj){
    
            visited[node] = 1;
            for(int i=0;i<adj.get(node).size();i++){
                if(visited[adj.get(node).get(i)] != 1)
                    dfs(adj.get(node).get(i),visited,adj);
            }
        
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            ArrayList<Integer> inner = new ArrayList<>();
            for(int j=0;j<n;j++){
                if(isConnected[i][j] == 1 && i!=j){
                    inner.add(j);
                }
            }
            adj.add(inner);
        }

        int[] visited = new int[n];
        int ans = 0;

        for(int i=0;i<n;i++){
            if(visited[i] != 1){
                ans++;
                dfs(i,visited,adj);
            }
        }

        return ans;


        
    }
}