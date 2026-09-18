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
    void reorderList(ListNode* head) {
        ListNode* slow = head;
        ListNode* fast= head;
        while(fast != NULL && fast->next != NULL){
            slow=slow->next;
            fast=fast->next->next;
        }
        ListNode* newHead=slow->next;
        slow->next=NULL;
        ListNode* temp=newHead;
        ListNode* prev=NULL;
        while(temp != NULL){
            ListNode* front =temp->next;
            temp->next =prev;
            prev=temp;
            temp=front;
        }
        ListNode*temp2=prev;
        ListNode* temp1=head;
        while(temp1 != NULL && temp2 != NULL){
            ListNode* front1=temp1->next;
            temp1->next=temp2;
            ListNode* front2=temp2->next;
            temp2->next=front1;
            temp1=front1;
            temp2=front2;

        }

    }
};
