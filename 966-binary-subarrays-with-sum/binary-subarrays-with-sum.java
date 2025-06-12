class Solution {
    public int helper(int[] nums, int goal){

        if (goal<0) return 0;
        
        int n = nums.length;

        int l = 0;
        int r = 0;

        int sum = 0;
        int cnt = 0;

        while(l<n){

            sum += nums[l];

            while(sum>goal){
                sum -= nums[r];
                r++;
            }

            cnt += (l-r+1);
            l++;
        }

        return cnt;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal) - helper(nums,goal-1);
    }
}