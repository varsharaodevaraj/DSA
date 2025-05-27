class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        if(n==1) return nums[0];

        int l = 0;
        int r = n-1;
        int minAns = Integer.MAX_VALUE;

        while(l<=r){
            int mid = l + (r-l)/2;

            minAns = Math.min(minAns,Math.min(nums[l],Math.min(nums[mid],nums[r])));

            if(nums[l]==nums[mid] && nums[mid]==nums[r]){
                l++;
                r--;
                continue;
            }

            if(nums[l]<=nums[mid]){
                minAns = Math.min(minAns,nums[l]);
                l = mid + 1;
            }else{
                minAns = Math.min(minAns,nums[mid]);
                r = mid - 1;
            }
        }

        return minAns;
    }
}