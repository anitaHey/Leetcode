/**
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
 * Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        
        ListNode search = head;
    
        while(search.next != null){
            if(search.val == search.next.val){
                ListNode tem = search.next.next;
                search.next.next = null;
                search.next = tem;
            }else{
                search = search.next;
            }
        }
        
        return head;
    }
}