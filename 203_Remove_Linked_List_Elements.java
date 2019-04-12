//Runtime: 1 ms, faster than 99.82% of Java online submissions for Remove Linked List Elements.
//Memory Usage: 40.7 MB, less than 81.75% of Java online submissions for Remove Linked List Elements.

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
        if(head==null) return head;
        while(head!=null && head.val==val) head = head.next;
        ListNode ptr = head;
        while(ptr!=null && ptr.next!=null){
            if(ptr.next.val==val) ptr.next = ptr.next.next;
            else ptr = ptr.next;
        }
        return head;
    }
}