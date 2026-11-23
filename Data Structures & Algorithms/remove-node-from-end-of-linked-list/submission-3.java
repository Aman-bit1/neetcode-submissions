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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;

        }
        int target=size-n;
        int ans=0;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp2=dummy;
        while(ans!=target){
            temp2=temp2.next;
            ans++;
        }
        temp2.next=temp2.next.next;
        return dummy.next;
    }
}
