/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        if(head==null) return -1;
        
        Node temp = head;
        int cnt = 0;
        while(temp!=null){
            cnt++;
            if(cnt==index){
                return temp.data;
            }
            temp = temp.next;
        }
        
        return -1;
    }
}