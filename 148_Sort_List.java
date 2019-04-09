//Runtime: 5 ms, faster than 38.04% of Java online submissions for Sort List.
//Memory Usage: 41.7 MB, less than 12.05% of Java online submissions for Sort List.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        return merge(head);
    }
    
    public ListNode merge(ListNode node){
        int length = length(node)/2;
        if(length!=0){  
            ListNode left = new ListNode(0),lhead = left;
            for(int a = 0;a<length;a++){
                left.next = new ListNode(node.val);
                left = left.next;
                node = node.next;
            }
            ListNode a = merge(node);
            ListNode b = merge(lhead.next);
            ListNode ans = new ListNode(0),head = ans,show = ans;
            while(a!=null && b!=null){
                if(a.val<b.val){
                    head.next = a;
                    a = a.next;
                }else{
                    head.next = b;
                    b = b.next;
                }
                head = head.next;
            }            
            if(a!=null) head.next = a;
            if(b!=null) head.next = b;

            return ans.next;
        }
        return node;
    }
    
    public int length(ListNode node){
        int length = 0;
        while(node!=null){
            node = node.next;
            length++;
        }
        return length;
    }
}