class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxLen = 0;
        for(int i:set){
            if(!set.contains(i-1)){
                int currLen = 0;
                int currEl = i;

                while(set.contains(currLen+currEl)) currLen++;

                if(currLen>maxLen) maxLen = currLen;
            }
        }
        return maxLen;
    }
}