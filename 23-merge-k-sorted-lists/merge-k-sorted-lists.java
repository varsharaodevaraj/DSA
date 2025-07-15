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
    public ListNode merge(ListNode a,ListNode b){
        if(a==null) return b;
        if(b==null) return a;

        ListNode res;

        if(a.val<b.val){
            res = a;
            res.next = merge(a.next,b);
        }else{
            res = b;
            res.next = merge(a,b.next);
        }

        return res;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;

        ListNode head = lists[0];
        for(int i=1;i<lists.length;i++){
            head = merge(head,lists[i]);
        }
        return head;
    }
}