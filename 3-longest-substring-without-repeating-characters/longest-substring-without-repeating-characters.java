class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();

        int l = 0;
        int r = 0;

        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();

        while(l<n){

            while(set.contains(s.charAt(l))){
                set.remove(s.charAt(r));
                r++;
            }

            set.add(s.charAt(l));
            maxLen = Math.max(maxLen,set.size());
            l++;

        }

        return maxLen;
    }
}