class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalCol = image[sr][sc];
        if(originalCol==color) return image;
        dfs(image,sr,sc,originalCol,color);
        return image;
    }
    public void dfs(int[][] image, int sr, int sc,int originalCol,int color){
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc] != originalCol){
            return;
        }
        image[sr][sc] = color;
        dfs(image,sr+1,sc,originalCol,color);
        dfs(image,sr-1,sc,originalCol,color);
        dfs(image,sr,sc+1,originalCol,color);
        dfs(image,sr,sc-1,originalCol,color);
    }
}