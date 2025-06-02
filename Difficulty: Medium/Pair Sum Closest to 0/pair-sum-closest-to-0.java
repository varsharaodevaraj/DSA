// User function Template for Java

class Solution {
    public static int closestToZero(int arr[], int n) {
        // your code here
        Arrays.sort(arr);
        
        int l = 0;
        int r = n-1;
        
        int sum = arr[l]+arr[r];
        
        int diff = sum;
        
        while(l<r){
            
            if(arr[l]+arr[r]==0){
                return 0;
            }
            
            if(Math.abs(arr[l]+arr[r])<Math.abs(diff)){
                sum = arr[l]+arr[r];
                diff = arr[l]+arr[r];
            }else if(Math.abs(arr[l]+arr[r])==Math.abs(diff)){
                sum = Math.max(sum , arr[l]+arr[r]);
            }
            
            
            if(arr[l]+arr[r]<0){
                l++;
            }else{
                r--;
            }
        }
        
        return sum;
    }
}