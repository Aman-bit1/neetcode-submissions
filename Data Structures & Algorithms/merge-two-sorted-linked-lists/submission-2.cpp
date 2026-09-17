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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
         ListNode* dummy=new ListNode(0);
         ListNode* tail=dummy;
        ListNode* temp1=list1;
        ListNode* temp2=list2;
        if(list1 == NULL && list2==NULL)return NULL;
        if(list1==NULL) return list2;
        if(list2==NULL) return list1;
        while(temp1 != NULL && temp2 !=NULL){
            if(temp1->val <temp2->val){
               tail->next=temp1;
               
                temp1=temp1->next;
                tail=tail->next;
            } 
            else{
              tail->next=temp2;
              temp2=temp2->next;
              tail=tail->next;  
            }

        }
        if(temp1==NULL){
            while(temp2 != NULL){
                tail->next=temp2;
                temp2=temp2->next;
                tail=tail->next;
            }
        }
        else{
             while(temp1 != NULL){
                tail->next=temp1;
                temp1=temp1->next;
                tail=tail->next;
            }
        }
      return dummy->next;
    }
};
