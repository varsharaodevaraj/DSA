class Solution {
    public int maxSum(int[] nums) {
        int res = 0;
        HashSet<Integer> set = new HashSet<>();
        int maxNegVal = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) set.add(nums[i]);
            else maxNegVal = Math.max(nums[i],maxNegVal);
        }
        for(int num : set){
            res+=num;
        }
        return res == 0 ? maxNegVal : res;
    }
}