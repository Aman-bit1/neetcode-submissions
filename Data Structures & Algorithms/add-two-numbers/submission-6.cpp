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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* plushead=new ListNode(0);
        ListNode* temp1=l1;
        ListNode* temp2=l2;
        unordered_map<ListNode*,ListNode*>mpp;
        int carry=0;
        ListNode* tail=plushead;
        while(temp1 != NULL|| temp2!=NULL || carry != 0){
        if(temp1==NULL && temp2==NULL){
            
            int z=carry;
         int digit=z%10;
          carry=z/10;
         ListNode* newhead=new ListNode(digit);
         tail->next=newhead;
         
        }
       else if(temp1==NULL){
            while(temp2 !=NULL){
                 
         int y=temp2->val;
         int z=y+carry;
         int digit=z%10;
          carry=z/10;
         ListNode* newhead=new ListNode(digit);
         tail->next=newhead;
         
         temp2=temp2->next;
         tail=tail->next;
            }
            
        }
        else if(temp2==NULL){
            while(temp1 !=NULL){
                 
         int x=temp1->val;
         int z=x+carry;
         int digit=z%10;
          carry=z/10;
         ListNode* newhead=new ListNode(digit);
         tail->next=newhead;
         
         temp1=temp1->next;
         tail=tail->next;
            }
           
        }
        else{
             int x= temp1->val;
         int y=temp2->val;
         int z=x+y+carry;
         int digit=z%10;
          carry=z/10;
         ListNode* newhead=new ListNode(digit);
         tail->next=newhead;
         temp1=temp1->next;
         temp2=temp2->next;
         tail=tail->next;
        }
        
        }
        return plushead->next;
    }
};
