//Runtime: 31 ms, faster than 40.64% of Java online submissions for Insertion Sort List.
//Memory Usage: 38 MB, less than 48.15% of Java online submissions for Insertion Sort List.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode cur = head;
        ListNode next = null;
        ListNode ptr = ans;
        while(cur!=null){
            next = cur.next;
            while(ptr.next!=null && cur.val>ptr.next.val) ptr = ptr.next;
            cur.next = ptr.next;
            ptr.next = cur;
            ptr = ans;
            cur = next;
            
        }
        return ans.next;
    }
}

