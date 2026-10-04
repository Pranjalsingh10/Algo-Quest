/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode next1=headA;
        ListNode next2=headB;

        while(next1!=next2){
            next1=(next1==null) ? headB:next1.next;
            next2=(next2==null) ? headA:next2.next;
        }
        return next1; 
    }
}