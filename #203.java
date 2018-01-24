/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode copy = head;
        while(head != null && head.next != null){
            if(head.next.val == val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return (copy.val == val) ? copy.next : copy;
    }
}


class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode copy = dummy;
        while(dummy != null && dummy.next != null){
            if(dummy.next.val == val){
                dummy.next = dummy.next.next;
            }else{
                dummy = dummy.next;
            }
        }
        return copy.next;
    }
}