
class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        int ans = 0;
        int max = 0;
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i]){
                max++;
                ans = Math.max(max,ans);
            }else{
                max = 0;
            }
        }
        
        return ans;
    }
}