/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        Node zeroDummy = new Node(-1);
        Node oneDummy = new Node(-1);
        Node twoDummy = new Node(-1);
        
        Node zero = zeroDummy;
        Node one = oneDummy;
        Node two = twoDummy;
        
        Node curr = head;
        while(curr!=null){
            
            if(curr.data == 0){
                zero.next = curr;
                zero = zero.next;
            }
            
            if(curr.data == 1){
                one.next = curr;
                one = one.next;
            }
            
            if(curr.data == 2){
                two.next = curr;
                two = two.next;
            }
            
            curr = curr.next;
            
        }
        
        zero.next = (oneDummy.next != null) ? oneDummy.next : twoDummy.next;
        one.next = twoDummy.next;
        two.next = null;
        
        return zeroDummy.next;
        
    }
}