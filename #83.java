/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//iteration
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode copy = head;
        while(copy != null && copy.next != null){
            if(copy.val == copy.next.val){
                copy.next = copy.next.next;
            }else{
                copy = copy.next;
            }
        }
        return head;
    }
}

// recursion
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        head.next = deleteDuplicates(head.next);
        return (head.val == head.next.val) ? head.next : head;
    }
}