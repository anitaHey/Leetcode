//Runtime: 20 ms, faster than 90.71% of Java online submissions for Add Two Numbers.
//Memory Usage: 47.7 MB, less than 44.50% of Java online submissions for Add Two Numbers.


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode point = ans,fir = l1,sec =l2;
        int carry = 0;
        while(fir!=null || sec != null){
            int a = (fir!=null)?fir.val:0;
            int b = (sec != null)?sec.val:0;
            int sum = a +b+carry;
            carry = sum / 10 ;
            point.next = new ListNode(sum % 10);
            point = point.next;
            if(fir!=null)fir = fir.next;
            if(sec!=null)sec = sec.next;
        }
        if(carry>0)
            point.next = new ListNode(carry);
        return ans.next;
    }
}