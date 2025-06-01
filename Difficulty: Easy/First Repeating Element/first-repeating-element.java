class Solution {
    public static int firstRepeated(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        int minEl = Integer.MAX_VALUE;
        
        for(int i = arr.length-1;i>=0;i--){
            if(set.contains(arr[i])){
                minEl = Math.min(minEl,i);
            }
            
            set.add(arr[i]);
        }
        
        if(minEl==Integer.MAX_VALUE) return -1;
        
        return minEl+1;
    }
}
