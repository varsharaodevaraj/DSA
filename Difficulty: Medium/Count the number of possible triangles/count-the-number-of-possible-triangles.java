// User function Template for Java

class Solution {
    // Function to count the number of possible triangles.
    static int countTriangles(int arr[]) {
        // code here
        Arrays.sort(arr);
        
        int n = arr.length;
        
        int ans = 0;
        
        for(int i=n-1;i>=2;i--){
            int j = 0;
            int k = i-1;
            
            while(j<k){
                if(arr[j]+arr[k]>arr[i]){
                    ans +=(k-j);
                    k--;
                }else{
                    j++;
                }
            }
        }
        return ans;
    }
}