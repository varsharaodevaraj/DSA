class Solution {
    public int characterReplacement(String s, int k) {

        int[] arr = new int[26];

        int n = s.length();

        int res = 0;

        int maxCnt = 0;
        int r = 0;

        for(int l=0;l<n;l++){
            arr[s.charAt(l)-'A']++;

            maxCnt = Math.max(maxCnt,arr[s.charAt(l)-'A']);

            while(((l-r+1)-maxCnt)>k){
                arr[s.charAt(r)-'A']--;
                r++;
            }

            res = Math.max(res,(l-r+1));

        }

        return res;
    }
}