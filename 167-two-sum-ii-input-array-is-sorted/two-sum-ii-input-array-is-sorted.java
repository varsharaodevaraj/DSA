class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // A Binary Search Approach

        int n = numbers.length;

        int[] ans = new int[2];

        int l = 0;
        int r = n-1;

        while(l<r){
            int sum = numbers[l]+numbers[r];

            if(sum==target){
                ans[0] = l + 1;
                ans[1] = r + 1;
                return ans;
            }else if(sum>target){
                r--;
            }else{
                l++;
            }
        } 
        return ans;
    }
}