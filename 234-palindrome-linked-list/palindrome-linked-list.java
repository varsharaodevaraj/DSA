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
    public ListNode mid(ListNode node){
        ListNode fast = node;
        ListNode slow = node;

        while (fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
    public ListNode reverse(ListNode node){
        ListNode prev = null;
        ListNode curr = node;
        while(curr!=null){
            ListNode nextNode = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode mid = mid(head);
        ListNode reverseList = reverse(mid.next);
        ListNode start = head;
        ListNode rev = reverseList;

        while(rev!=null){
            if(rev.val != start.val){
                return false;
            }
            rev = rev.next;
            start = start.next;
        }

        return true;



    }
}