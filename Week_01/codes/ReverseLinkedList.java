public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur != null){
            ListNode nex = cur.next;
            cur.next=pre;
            pre=cur;
            cur = nex;
        }
        return pre;
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }


//递归
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        return recurseList(pre,head);
    }
    public ListNode recurseList(ListNode pre,ListNode cur){
        if(cur==null) return pre;
        ListNode nex = cur.next;
        cur.next=pre;
        return recurseList(cur,nex);
    }


}
