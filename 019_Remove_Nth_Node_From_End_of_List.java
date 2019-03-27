//Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
//Memory Usage: 36.9 MB, less than 92.46% of Java online submissions for Remove Nth Node From End of List.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans = new ListNode(0);
        ans.next = head;
        int length = size(head)-n;
        ListNode tem = ans;
        for(int a = 0;a<=length;a++){
            tem = tem.next;
        }
        tem.next = tem.next.next;
        return ans.next;
    }
    
    public int size(ListNode head) {
        int size = 0;
        for(ListNode n = head; n.next != null; n = n.next)
            size++;
        return size;
    }
}