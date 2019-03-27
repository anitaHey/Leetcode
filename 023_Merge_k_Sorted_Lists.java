//Runtime: 2 ms, faster than 99.99% of Java online submissions for Merge k Sorted Lists.
//Memory Usage: 41.6 MB, less than 12.34% of Java online submissions for Merge k Sorted Lists.

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        return half(lists,0,lists.length-1);
    }
    public ListNode half(ListNode[] lists,int left,int right){
        if(left < right){
            int length = (left+right)/2;
            ListNode a =half(lists,left,length);
            ListNode b =half(lists,length+1,right);
            return merge(a,b);
        }else{
            return lists[left];
        }        
    }
    
    public ListNode merge(ListNode a,ListNode b){
        ListNode ans = new ListNode(0);
        ListNode fin = ans;
        while(a!=null && b!=null){
            if(a.val>b.val){
                ans.next = new ListNode(b.val);
                b = b.next;
            }else{
                ans.next = new ListNode(a.val);
                a = a.next;
            }
            ans = ans.next;
        }
        while(a!=null){
            ans.next = new ListNode(a.val);
            ans = ans.next;
            a = a.next;
        }
        while(b!=null){
            ans.next = new ListNode(b.val);
            ans = ans.next;
            b = b.next;
        }
        return fin.next;
    }
}