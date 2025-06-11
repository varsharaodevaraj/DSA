class Solution {
    public int totalFruit(int[] fruits) {

        int n = fruits.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        int l = 0;
        int r = 0;

        int maxLength = 0;

        while(l<n){

            map.put(fruits[l],map.getOrDefault(fruits[l],0)+1);
            
            while(map.size()>2){
                map.put(fruits[r],map.get(fruits[r])-1);
                if(map.get(fruits[r])==0){
                    map.remove(fruits[r]);
                }
                r++;
            }

            maxLength = Math.max(maxLength,(l-r+1));
            l++;
            
        }

        return maxLength;
    }
}