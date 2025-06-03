class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] leftSum=new int[n];
        int left=0;
        for(int i=0;i<n;i++){
            left+=nums[i];
            leftSum[i]=left;
        }
        int[] rightSum=new int[n];
        int right=0;
        for(int i=n-1;i>=0;i--){
            right+=nums[i];
            rightSum[i]=right;
        }

        for(int i=0;i<n;i++){
            if(leftSum[i]==rightSum[i]){
                return i;
            }
        }
        return -1;
    }
}