class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        //using binary search on possible answers range
        //[1,3,5,80,200]
        //H index can be 0,1,2,3,4,5 for 5 length array (basically 0 to n)
        int l = 1;
        int r = n;
        int midIdx = 0;
        int hIdx = 0;
        while (l<=r){
            midIdx = (l + r)/2; //possible h index
            if (citations[n - midIdx] >= midIdx ) {
                l = midIdx + 1;
                hIdx = midIdx;
            } else{
                r = midIdx - 1;
            }
        }
        return hIdx;
    }
}