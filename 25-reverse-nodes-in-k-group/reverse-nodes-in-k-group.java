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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        ListNode curr = head;
        int count = 0;

        // Count k nodes ahead
        while (curr != null && count < k) {
            curr = curr.next;
            count++;
        }

        // If we have k nodes, reverse them
        if (count == k) {
            // Reverse first k nodes
            ListNode reversedHead = reverse(head, k);
            // head is now the tail after reversal
            head.next = reverseKGroup(curr, k); // Recursively reverse remaining
            return reversedHead;
        }

        return head; // Less than k nodes, return as-is
    }

    // Reverse k nodes and return new head
    private ListNode reverse(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;
        while (k-- > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}