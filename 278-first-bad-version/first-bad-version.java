/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 0;
        int r = n;

        int ans = 1;

        while(l<=r){
            int mid = l + (r-l)/2;

            if(isBadVersion(mid)==false){
                l = mid + 1;
            }else{
                ans = mid;
                r = mid - 1;
            }
        }
        return ans;
    }
}