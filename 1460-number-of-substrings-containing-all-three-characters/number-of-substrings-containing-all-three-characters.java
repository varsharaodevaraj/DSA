class Solution {
    public int numberOfSubstrings(String s) {
        int res = 0;

        int n = s.length();

        int a = -1;
        int b = -1;
        int c = -1;

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='a') a = i;
            else if(ch=='b') b = i;
            else if(ch=='c') c = i;

            res += Math.min(a, Math.min(b, c)) + 1;
        }

        return res;
    }
}