class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){

                ans = i - map.get(nums[i]);
                map.put(nums[i],i);

                if(ans<=k){
                    return true;
                }

            }
            
            map.put(nums[i],i);

        }

        return false;
    }
}