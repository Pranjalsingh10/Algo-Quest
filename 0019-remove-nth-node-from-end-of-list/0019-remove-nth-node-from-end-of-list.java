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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast ahead by n + 1 steps so the gap between fast and slow is n nodes
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both until fast hits null
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // slow is now right before the node to be removed
        slow.next = slow.next.next;

        return dummy.next;
    }
}