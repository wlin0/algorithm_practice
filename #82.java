/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        dummy.next = head;
        while(head != null){
            while(head.next != null && head.val == head.next.val){
                head = head.next;
            }
            if(pre.next != head){
                pre.next = head.next;
            }else{
                pre = pre.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}