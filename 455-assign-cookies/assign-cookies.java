class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int n = g.length;
        int m = s.length;

        int i = 0;
        int j = 0;

        while(i<m && j<n){
            if(g[j]<=s[i]){
                j++;
            }
            i++;
        }

        return j;
    }
}