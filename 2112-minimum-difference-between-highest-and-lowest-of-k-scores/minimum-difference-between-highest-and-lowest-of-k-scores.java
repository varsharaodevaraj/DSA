class Solution {
    public int minimumDifference(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int l = 0;
        for(int r=0;r<nums.length;r++){
            if(r-l+1==k){
                int temp = Math.abs(nums[l]-nums[r]);
                min = Math.min(min,temp);
                l++;
            }
        }
        return min;
    }
}