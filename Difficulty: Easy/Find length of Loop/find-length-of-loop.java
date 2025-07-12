/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // code here.
        if(head==null || head.next==null) return 0;
        
        Node fast = head;
        Node slow = head;
        int len = 0;
        
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast==slow){
                len++;
                slow = slow.next;
                while(slow!=fast){
                    len++;
                    slow = slow.next;
                }
                return len;
            }
        }
        
        return len;
    }
}