// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int min = Integer.MAX_VALUE;
        int ans = -1;
        
        int l = 0;
        int r = arr.size()-1;
        
        while(l<=r){
            
            int mid = l + (r-l)/2;
            
            if(arr.get(l)<=arr.get(r)){
                if(arr.get(l)<min){
                    min = arr.get(l);
                    ans = l;
                }
                break;
            }
            
            if(arr.get(l)<=arr.get(mid)){
                if(arr.get(l)<min){
                    min = arr.get(l);
                    ans = l;
                }
                l = mid + 1;
            }else{
                if(arr.get(mid)<min){
                    min = arr.get(mid);
                    ans = mid;
                }
                r = mid - 1;
            }
        }
        return ans;
    }
}