class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int pos = 0;
        int neg = 0;
        int i = 0;

        while (i < n) {
            if (i % 2 == 0) {
                while (nums[pos] < 0) {
                    pos++;
                }
                result[i] = nums[pos];
                pos++;
            }
            else {
                while (nums[neg] > 0) {
                    neg++;
                }
                result[i] = nums[neg];
                neg++;
            }
            i++;
        }

        return result;
    }
}
