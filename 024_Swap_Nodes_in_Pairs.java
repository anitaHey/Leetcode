//Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
//Memory Usage: 35.8 MB, less than 91.13% of Java online submissions for Swap Nodes in Pairs.

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode now = ans;
        while(now.next!=null &&now.next.next!=null){
            ListNode fir = now.next;
            ListNode sec = now.next.next;
            fir.next = sec.next;
            now.next = sec;
            now.next.next= fir;
            now = now.next.next;
        }
        return ans.next;
    }
}
