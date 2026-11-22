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
    public void reorderList(ListNode head) {
        int cnt=0;
        ListNode temp=head;
        while(temp != null){
            cnt++;
            temp=temp.next;
        }
        int target=(cnt+1)/2;
        ListNode temp2=head;
        int ans=0;
        while(ans != target-1){
            temp2=temp2.next;
            ans++;
        }
        ListNode temp3=temp2.next;
        temp2.next=null;
        ListNode top=temp3;
        ListNode prev=null;
        while(top!=null){
            ListNode front=top.next;
            top.next=prev;
            prev=top;
            top=front;
        }
        ListNode first=head;
        ListNode second=prev;
        while(second !=null ){
            ListNode front1=first.next;
            ListNode front2=second.next;
            first.next=second;
            second.next=front1;
            first=front1;
            second=front2;
        }

    }
}
