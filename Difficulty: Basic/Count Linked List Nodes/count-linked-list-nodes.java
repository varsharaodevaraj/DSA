/*Complete the function below*/
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int cnt = 0;
        if(head == null) return cnt;
        
        Node temp = head;
        while(temp!=null){
            cnt++;
            temp = temp.next;
        }
        
        return cnt;
    }
}