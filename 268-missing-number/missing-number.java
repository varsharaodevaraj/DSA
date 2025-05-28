class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n*(n+1)/2;
        int numSum = 0;

        for(int i=0;i<nums.length;i++){
            numSum += nums[i];
        }

        return totalSum - numSum;
    }
}