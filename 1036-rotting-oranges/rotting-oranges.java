class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j]==1) fresh++;
            }
        }

        if(fresh==0) return 0;

        int time = 0;
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int size = q.size();
            boolean rottedMin = false;

            for(int i=0;i<size;i++){
                int[] pos = q.poll();
                int x = pos[0];
                int y = pos[1];

                for(int[] dir: directions){
                    int newX = x + dir[0];
                    int newY = y + dir[1];

                    if(newX>=0 && newY>=0 && newX<m && newY<n && grid[newX][newY]==1){
                        grid[newX][newY] = 2;
                        q.add(new int[]{newX,newY});
                        fresh--;
                        rottedMin = true;
                    }
                }
            }
            if(rottedMin) time++;
        }

        return fresh == 0 ? time : -1;
    }
}