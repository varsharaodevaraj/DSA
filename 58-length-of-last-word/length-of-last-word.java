class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = s.length();
        int ans = 0;
        for(int i = len-1;i>=0;i--){
            if(s.charAt(i)==' ') return ans;
            ans++;
        }
        return ans;
    }
}