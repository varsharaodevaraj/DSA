class Solution {
    public int[] getThreeLargest(int arr[]) {
        // code here
        int n = arr.length;
        
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i]>max2 && arr[i]!=max1){
                max3 = max2;
                max2 = arr[i];
            }else if(arr[i]>max3 && arr[i]!=max2 && arr[i]!=max1){
                max3 = arr[i];
            }
        }
        if(max2==Integer.MIN_VALUE) return new int[]{max1};
        else if(max3==Integer.MIN_VALUE) return new int[]{max1,max2};
        
        return new int[]{max1,max2,max3};
    }
}