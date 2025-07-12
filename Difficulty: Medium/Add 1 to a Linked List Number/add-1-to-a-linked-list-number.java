/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        
        while(curr!=null){
            Node nextNode = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        if(head==null) return null;
        
        Node reversedLL = reverse(head);
        int carry = 1;
        
        Node ans = new Node(-1);
        Node temp = ans;
        
        Node t1 = reversedLL;
        
        while(t1!=null){
            int sum = carry;
            sum += t1.data;
            Node newNode = new Node(sum%10);
            temp.next = newNode;
            
            carry = sum/10;
            
            temp = temp.next;
            t1 = t1.next;
        }
        
        if(carry>0){
            Node newNode = new Node(carry);
            temp.next = newNode;
        }
        
        return reverse(ans.next);
    }
}