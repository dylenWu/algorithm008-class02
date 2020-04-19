public class MergeTwoLists {
  class ListNode {
     int val;
     ListNode next;

     ListNode(int x) {
         val = x;
     }
 }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // ListNode all = new ListNode(0);
        // ListNode re = all;
        // while(l1!=null||l2!=null){
        //     if(l2==null||(l1!=null&&l1.val<=l2.val)){
        //       all.next=l1;
        //         l1 = l1.next;
        //     }
        //     else if(l1==null||(l2!=null&&l2.val<l1.val)){
        //        all.next=l2;
        //         l2=l2.next;
        //     }
        // all=all.next;
        // }
        // return re.next;
        if(l1==null){
            return l2;
        }
        else if(l2==null){
            return l1;
        }
        else if(l1.val<=l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
        else {
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

}
