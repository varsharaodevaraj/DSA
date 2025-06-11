class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        int sum = 0;

        for(int i=0;i<k;i++){
            sum += cardPoints[i];
        }

        int maxSum = sum;

        int l = k-1;
        int r = cardPoints.length-1;

        while(l>=0){
            sum = sum - cardPoints[l] + cardPoints[r];
            maxSum = Math.max(sum,maxSum);
            l--;
            r--;
        }

        return maxSum;
    }
}