class Solution {
    public int findMax(int mat[][],int n,int m,int mid){
        int index = -1;
        int max = -1;
        for(int i=0;i<n;i++){
            if(mat[i][mid]>max){
                max = mat[i][mid];
                index = i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int l = 0;
        int r = m-1;
        while(l<=r){
            int mid = (l+r)/2;
            int row = findMax(mat,n,m,mid);
            int left = (mid-1>=0) ? mat[row][mid-1] : -1;
            int right = (mid+1<m) ? mat[row][mid+1] : -1;
            if(mat[row][mid]>left && mat[row][mid]>right) return new int[]{row, mid};
            else if(mat[row][mid]<left) r = mid-1;
            else l = mid+1;
        }
        return new int[]{-1, -1};
    }
}