class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = (n1+n2);
        int cnt = 0;
        int idx1 = n/2;
        int idx2 = idx1-1;
        int i = 0;
        int j = 0;

        int ans1 = -1;
        int ans2 = -1;

        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                if(cnt == idx1) ans1 = nums1[i];
                else if(cnt == idx2) ans2 = nums1[i];

                cnt++;
                i++;
            }else{
                if(cnt == idx1) ans1 = nums2[j];
                else if(cnt == idx2) ans2 = nums2[j];

                cnt++;
                j++;
            }
        }

        while(i<n1){
            if(cnt == idx1) ans1 = nums1[i];
            else if(cnt == idx2) ans2 = nums1[i];

            cnt++;
            i++;
        }

        while(j<n2){
            if(cnt == idx1) ans1 = nums2[j];
            else if(cnt == idx2) ans2 = nums2[j];

            cnt++;
            j++;
        }

        if(n%2==1){
            return ans1;
        }

        return (double)((double)(ans1+ans2))/2.0;
    }
}