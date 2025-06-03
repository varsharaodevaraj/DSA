class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        ArrayList<Integer> list = new ArrayList<>();

        int l = 0;
        int h = arr.length-1;

        while(h-l>=k){
            if(Math.abs(arr[l]-x)>Math.abs(arr[h]-x)){
                l++;
            }else{
                h--;
            }
        }

        for(int i=l;i<=h;i++){
            list.add(arr[i]);
        }

        return list;
    }
}