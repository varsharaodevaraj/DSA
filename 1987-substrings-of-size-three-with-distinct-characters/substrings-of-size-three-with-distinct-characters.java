class Solution {
    public boolean check(String s){
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        if(set.size()==3) return true;
        return false;
    }
    public int countGoodSubstrings(String s) {
        int cnt = 0;
        int n = s.length();
        for(int i=0;i<=n-3;i++){
            boolean check = check(s.substring(i,i+3));
            if(check) cnt++;
        }
        return cnt;
    }
}