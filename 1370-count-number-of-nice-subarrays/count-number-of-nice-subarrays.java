class Solution {
    public int atmostK(int arr[],int k){
        int l = 0;
        int count = 0;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                count++;
            }
            while(count>k){
                if(arr[l]%2==1){
                    count--;
                }
                l++;
            }
            ans += i-l+1;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int m1 = atmostK(nums,k);
        int m2 = atmostK(nums,k-1);
        return m1-m2;
    }
}