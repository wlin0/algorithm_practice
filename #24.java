/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr.next != null && curr.next.next != null){
            ListNode one = curr.next;
            ListNode two = curr.next.next;
            
            one.next = two.next;
            two.next = one;
            curr.next = two;
            curr = one;
        }
        return dummy.next;
    }
}