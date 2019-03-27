//Runtime: 1 ms, faster than 99.55% of Java online submissions for Merge Two Sorted Lists.
//Memory Usage: 37.1 MB, less than 97.90% of Java online submissions for Merge Two Sorted Lists.

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans= new ListNode(0);
        ListNode fin = ans;
        while(l1!=null && l2!=null){
            int min = 0;
            if(l1.val>l2.val){
                min = l2.val;
                l2 = l2.next;
            }else{
                min = l1.val;
                l1 = l1.next;
            }
            ans.next = new ListNode(min);
            ans = ans.next;
        }
        while(l1!=null){
            ans.next = new ListNode(l1.val);
            ans = ans.next;
            l1 = l1.next;
        }
        while(l2!=null){
            ans.next = new ListNode(l2.val);
            ans = ans.next;
            l2 = l2.next;
        }
    return fin.next;
    }
}