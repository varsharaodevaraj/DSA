class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int cnt_max = 0;
        int index = 0;

        for (int i = 0; i < mat.length; i++) {
            int cnt_ones = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) cnt_ones++;
            }

            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }

        return new int[]{index, cnt_max};
    }
}
