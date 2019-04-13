//Runtime: 1 ms, faster than 94.26% of Java online submissions for Palindrome Linked List.
//Memory Usage: 42.8 MB, less than 20.47% of Java online submissions for Palindrome Linked List.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        int length = getLength(head);
        if(length==1) return true;
        ListNode ptr = reverse(head,length);

        for(int a = 0;a<length/2;a++){
            if(head.val!=ptr.val) return false;
            head = head.next;
            ptr = ptr.next;
        }
        return true;
        
    }
    public int getLength(ListNode head){
        ListNode ptr = head;
        int count =0 ;
        while(ptr!=null){
            ptr = ptr.next;
            count++;
        }
        return count;
    }
    
    public ListNode reverse(ListNode head,int length){
        ListNode prev = null;
        ListNode mid = head;
        for(int a = 0;a<length/2;a++){
            mid = mid.next;
        }
        while (mid != null) {
            ListNode next = mid.next;
            mid.next = prev;
            prev = mid;
            mid = next;
        }
        return prev;
    }
}