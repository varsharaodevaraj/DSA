class Solution {
    public int firstOcc(int arr[],int target){
        int l = 0;
        int r = arr.length-1;

        int ans = -1;

        while(l<=r){

            int mid = l + (r-l)/2;

            if(arr[mid] >= target){
                if(arr[mid]==target) ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        return ans;
    }

    public int lastOcc(int arr[],int target){
        int l = 0;
        int r = arr.length-1;

        int ans = -1;

        while(l<=r){

            int mid = l + (r-l)/2;

            if(arr[mid] <= target){
                if(arr[mid]==target) ans = mid;
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }

        return ans;
    }
    public int[] searchRange(int[] nums, int target) {

        int[] arr = new int[2];

        int f = firstOcc(nums,target);
        int l = lastOcc(nums,target);

        arr[0] = f;
        arr[1] = l;

        return arr;
    }
}