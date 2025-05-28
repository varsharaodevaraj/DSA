class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length; 

        int l = 1;
        int r = n;

        int max = 0;

        while(l<=r){
            int mid = l + (r-l)/2;

            if(citations[n-mid]>=mid){
                max = mid;
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }

        return max;
    }
}