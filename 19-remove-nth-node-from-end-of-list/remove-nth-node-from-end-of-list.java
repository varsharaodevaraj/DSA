/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int length(ListNode head){

        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }

        return len;

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int len = length(head);

        if(head==null) return null;

        int newN = len - n;
        newN++;

        if(newN>len) return head;
        if(newN==1) return head.next;

        ListNode curr = head;
        for(int i=1;i<newN-1 && curr!=null;i++){
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
        
    }
}