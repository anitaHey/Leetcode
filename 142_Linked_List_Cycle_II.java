//Runtime: 6 ms, faster than 21.51% of Java online submissions for Linked List Cycle II.
//Memory Usage: 34.9 MB, less than 32.30% of Java online submissions for Linked List Cycle II.

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while(head!=null){
            if(set.contains(head)) return head;
            else set.add(head);
            head = head.next;
        }
        return null;
    }
}