class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length+1;
        
        long totSum = n*(n+1)/2;
        
        long arrSum = 0;
        
        for(int i=0;i<n-1;i++){
            arrSum += arr[i];
        }
        
        return (int)(totSum - arrSum);
        
    }
}