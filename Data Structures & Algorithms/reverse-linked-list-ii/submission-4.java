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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        temp=head;
       
            int target=right-1;
            int ans=0;
            while(ans!=target){
                ans++;
                temp=temp.next;
            }
            
            ListNode temp2=temp.next;
            temp.next=null;
            temp=head;
            int ansl=0;
              ListNode temp3;
            ListNode tempL;
            if(left!=1){
                while(ansl!=left-2){
                ansl++;
                temp=temp.next;
            }
          
                temp3=temp.next;
               tempL=temp;
            }
            else{
                temp3=head;
               tempL=null;
            } 
            temp=head;
            ListNode prev=temp2;
             while(temp3!=null){
                ListNode front=temp3.next;
                temp3.next=prev;
                
                prev=temp3;
                temp3=front;

             }
            if(tempL!=null) tempL.next=prev;
           if(left==1)return prev;
           else return  head;
    }
}