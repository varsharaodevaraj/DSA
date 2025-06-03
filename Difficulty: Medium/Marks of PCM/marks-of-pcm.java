// User function Template for Java

class Solution {
    class student{
        int phy;
        int chem;
        int math;
        
        student(int phy,int chem,int math){
            this.phy = phy;
            this.chem = chem;
            this.math = math;
        }
    }
    public void customSort(int phy[], int chem[], int math[], int N) {
        // your code here
        ArrayList<student> list = new ArrayList<>();
        
        for(int i=0;i<N;i++){
            list.add(new student(phy[i],chem[i],math[i]));
        }
        
        Collections.sort(list,new Comparator<student>(){
            public int compare(student s1,student s2){
                if(s1.phy != s2.phy){
                    return s1.phy - s2.phy;
                }
                if(s1.chem != s2.chem){
                    return s2.chem - s1.chem;
                }
                
                return s1.math - s2.math;
            }
        });
        
        for (int i = 0; i < N; i++) {
            phy[i] = list.get(i).phy;
            chem[i] = list.get(i).chem;
            math[i] = list.get(i).math;
        }
    }
}
