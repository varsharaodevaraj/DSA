class Solution {
    public int[] leftSmaller(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>=arr[i]) st.pop();
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
}
