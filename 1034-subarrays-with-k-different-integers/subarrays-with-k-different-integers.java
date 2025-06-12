class Solution {
    public int helper(int[] nums, int k){
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        int l = 0;
        int r = 0;

        int ans = 0;

        while(l<n){

            map.put(nums[l],map.getOrDefault(nums[l],0)+1);

            while(map.size()>k){
                map.put(nums[r],map.get(nums[r])-1);
                if(map.get(nums[r])==0){
                    map.remove(nums[r]);
                }
                r++;
            }

            ans += (l-r+1);
            l++;

        }

        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k) - helper(nums,k-1);
    }
}