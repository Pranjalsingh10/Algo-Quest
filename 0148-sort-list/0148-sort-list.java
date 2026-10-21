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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        // 1. Collect all values into a list
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        // 2. Sort the values
        Collections.sort(list);

        // 3. Reassign values back to the nodes
        curr = head;
        for (int val : list) {
            curr.val = val;
            curr = curr.next;
        }

        return head;
    }
}