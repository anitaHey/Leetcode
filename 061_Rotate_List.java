//Runtime: 1 ms, faster than 95.84% of Java online submissions for Rotate List.
//Memory Usage: 37 MB, less than 90.74% of Java online submissions for Rotate List.

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
        ListNode ans = new ListNode(0);
        ans.next = head;
        int length = 0;
        if(head == null) return null;
        while(head.next!=null){
            head = head.next;
            length++;
        }
        
        for(int a = 0 ; a < k % (length+1);a++){
            head.next= ans.next;
            ans.next = head;
            for(int b = 0;b<length;b++){
                head = head.next;
            }
            head.next = null;
        }
        
        return ans.next;
    }
}