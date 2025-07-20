class Solution {
    public int possible(int arr[],int mid){
        int cnt = 0;
        for(int i=0;i<arr.length;i++){
            cnt = cnt + (int)Math.ceil((double)arr[i] / (double)mid);
        }

        return cnt;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }

        int l = 1;
        int r = max;
        int ans = -1;

        while(l<=r){
            int mid = (l+r)/2;
            if(possible(nums,mid)<=threshold){
                ans = mid;
                r = mid -1;
            }else{
                l = mid + 1;
            }
        }

        return ans;
    }
}