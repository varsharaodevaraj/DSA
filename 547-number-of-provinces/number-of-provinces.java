class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        boolean[] visited = new boolean[n];
        int cnt = 0;
        
        for(int i=0;i<n;i++){
            if(!visited[i]){
                cnt++;
                dfs(i,adj,visited);
            }
        }

        return cnt;
    }
    public void dfs(int i,ArrayList<ArrayList<Integer>> adj,boolean[] visited){
        visited[i] = true;

        for(int neighbour:adj.get(i)){
            if(!visited[neighbour]){
                dfs(neighbour,adj,visited);
            }
        }
    }
}