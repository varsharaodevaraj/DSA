// User function Template for Java

class Solution {
    Node removeDuplicates(Node head) {
        // Code Here.
        if(head==null || head.next==null) return head;
        Node temp = head.next;
        
        while(temp!=null){
            if(temp.data==temp.prev.data){
                Node prev = temp.prev;
                Node next = temp.next;
                
                prev.next = next;
                if(next != null) {
                    next.prev = prev;
                }
                temp = next;
            }else{
                temp = temp.next;
            }
        }
        
        return head;
    }
}