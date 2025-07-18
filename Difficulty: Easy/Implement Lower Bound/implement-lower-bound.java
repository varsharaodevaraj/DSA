class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int l = 0;
        int r = arr.length-1;
        // int ans = ;
        while(l<=r){
        int mid = l+(r-l)/2;
            if(arr[mid]>=target){
                // ans = mid;
                r = mid-1;
            }
            else l = mid+1;
        }
        return l;
    }
}
