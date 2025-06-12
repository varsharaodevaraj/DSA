class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character,Integer> targetMap = new HashMap<>();

        for(int i=0;i<t.length();i++){
            targetMap.put(t.charAt(i),targetMap.getOrDefault(t.charAt(i),0)+1);
        }

        int matched = 0;
        int l = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int r=0;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);

            if(targetMap.containsKey(s.charAt(r)) && map.get(s.charAt(r))<=targetMap.get(s.charAt(r))){
                matched++;
            }

            while(matched == t.length()){
                if((r-l+1)<minLen){
                    minLen = (r-l+1);
                    start = l;
                }
                
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(targetMap.containsKey(s.charAt(l)) && map.get(s.charAt(l))<targetMap.get(s.charAt(l))){
                    matched--;
                }

                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start+minLen);
    }
}