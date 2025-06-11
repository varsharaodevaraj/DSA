class Solution {
    public int longestOnes(int[] nums, int k) {

        int n = nums.length;
        
        int l = 0;
        int r = 0;

        int cntZero = 0;

        int maxLen = 0;

        while(l<n){
            
            if(nums[l]==0){
                cntZero++;
            }

            while(cntZero>k){
                if(nums[r]==0){
                    cntZero--;
                }
                r++;
            }

            maxLen = Math.max(maxLen,(l-r+1));
            l++;
        }

        return maxLen;
    }
}