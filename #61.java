/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        ListNode walker = head;
        int len = 0;
        while(walker.next != null){
            walker = walker.next;
            len++;
        }
        len++;
        walker.next = head;
        for(int i = 0; i < len - k % len - 1; i++){
            head = head.next;
        }
        ListNode newHead = head.next;
        head.next = null;
        return newHead;
    }
}