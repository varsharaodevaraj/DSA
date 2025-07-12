// User function Template for Java

/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/
class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        if(head==null) return null;
        
        Node curr = head;
        while(curr!=null){
            if(curr.data==x){
                Node prev = curr.prev;
                Node next = curr.next;
                
                if (prev != null) {
                    prev.next = next;
                } else {
                    head = next;
                }
                if(next!=null) next.prev = prev;
                
                curr = next;
            }else{
                curr = curr.next;
            }
        }
        
        return head;
    }
}