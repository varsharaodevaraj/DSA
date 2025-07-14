class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }

        k = k % len;
        if (k == 0) return head;

        // Move to the (len - k - 1)th node
        int steps = len - k;
        curr = head;
        while (--steps > 0) {
            curr = curr.next;
        }

        ListNode newHead = curr.next;
        curr.next = null;

        ListNode tail = newHead;
        while (tail != null && tail.next != null) {
            tail = tail.next;
        }

        if (tail != null) {
            tail.next = head;
        }

        return newHead;
    }
}
