//Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
//Memory Usage: 37.9 MB, less than 14.19% of Java online submissions for Reverse Linked List.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode ans = null;
        ListNode ptr = head;
        while(ptr!=null){
            ListNode tem = ptr.next;
            ptr.next = ans;
            ans = ptr;
            ptr = tem;
        }
        return ans;
    }
}