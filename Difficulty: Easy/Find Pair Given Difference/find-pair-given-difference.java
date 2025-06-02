
class Solution {
    public boolean findPair(int[] arr, int x) {
        // code here
        Arrays.sort(arr);
        
        int n = arr.length;
        
        int r = 1;
        
        for(int l=0;l<n;l++){
            
            while(r<n && arr[r]-arr[l]<x) r++;
            
            if(r<n && r!=l && arr[r]-arr[l]==x) return true;
        }
        
        return false;
    }
}
