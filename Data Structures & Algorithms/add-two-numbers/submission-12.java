/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode prev1=null;
        if(l1.val==0 && l2.val==0) return new ListNode(0);
        if(l1==null)return l2;
        if(l2==null) return l1;
        int carry=0;
        ListNode dummy=new ListNode(0);
        ListNode head=dummy;
        while(l1!=null || l2!=null || carry!=0){
           int val1= (l1!=null)?l1.val:0;
            int val2= (l2!=null)?l2.val:0;
             int sum=val1+val2+carry;
             int digit=sum%10;
             carry=sum/10;
             ListNode newNode=new ListNode(digit);
             head.next=newNode;
             head=head.next;
         if(l1!=null) l1=l1.next;
          if(l2!=null)l2=l2.next;
        }
    return dummy.next;
    }
}
