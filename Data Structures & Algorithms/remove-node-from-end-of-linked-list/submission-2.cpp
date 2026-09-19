/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* temp=head;
        int cnt=0;
        while(temp!=NULL){
            temp=temp->next;
            cnt++;

        }
        if(cnt==1) return NULL;
        int x = cnt-n;
       if(x==0) return head->next;
        ListNode* temp1=head;
          
        int count=0;
        while(temp1!=NULL){
          if(count==x-1){
            temp1->next=temp1->next->next;
          }
          temp1=temp1->next;
          count++;
        }
        return head;
    }
};
