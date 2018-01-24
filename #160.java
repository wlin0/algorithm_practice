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
        if(headA == null || headB == null){
            return null;
        }
        ListNode copyA = headA;
        ListNode copyB = headB;
        
        while(headA != headB){
            headA = (headA == null) ? copyB : headA.next;
            headB = (headB == null) ? copyA : headB.next;
        }
        
        return headA;
    }
}