class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        while(l<n){
            sum += nums[l];
            while(sum>=target){
                ans = Math.min(ans,(l-r+1));
                sum -= nums[r];
                r++;
            }
            l++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}