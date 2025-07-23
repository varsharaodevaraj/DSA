class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int v = adj.size();
        boolean[] visited = new boolean[v];
        ArrayList<Integer> list = new ArrayList<>();
        
        helper(0,visited,adj,list);
        return list;
    }
    public void helper(int node,boolean[] visited,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res){
        visited[node] = true;
        res.add(node);
        
        for(int neighbour:adj.get(node)){
            if(!visited[neighbour]){
                helper(neighbour,visited,adj,res);
            }
        }
    }
}