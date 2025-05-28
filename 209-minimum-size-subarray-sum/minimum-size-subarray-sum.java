class Solution {
    public boolean isValid(int[] nums,int mid,int target){
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<mid;i++){
            sum += nums[i];
        }

        if(sum>=target) return true;

        for(int i=mid;i<n;i++){
            sum += nums[i] - nums[i-mid];
            if(sum>=target) return true;
        }

        return false;
    }
    public int minSubArrayLen(int target, int[] nums) {
        // A Binary search approach of time complexity --> O(n log n):

        int n = nums.length;
        
        int l = 0;
        int r = n;
        int ans = 0;

        while(l<=r){
            int mid = l + (r-l)/2;

            if(isValid(nums,mid,target)){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }
}