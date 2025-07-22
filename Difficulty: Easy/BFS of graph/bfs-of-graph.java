class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int v = adj.size();
        ArrayList<Integer> list = new ArrayList<>();
        boolean visited[] = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(0);
        visited[0] = true;
        
        while(!q.isEmpty()){
            int node = q.poll();
            list.add(node);
            
            for(int neighbour:adj.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.offer(neighbour);
                }
            }
        }
            return list;
    }
}