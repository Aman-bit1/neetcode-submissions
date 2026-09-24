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
    ListNode* reverseBetween(ListNode* head, int left, int right) {
       ListNode* temp=head;
       int cnt=1;
         ListNode* leftnodePrev;
             ListNode* leftnode;
              ListNode* rightnode;
               ListNode* rightnodeNext;
       while(temp!=NULL){
        if(cnt==left-1){
              leftnodePrev=temp;
              leftnode=temp->next;
             break;
        }
        temp=temp->next;
        cnt++;
       }
       if(cnt!=left-1){
         leftnode=head;
         leftnodePrev=NULL;
       }
       temp=head;
       cnt=1;
        while(temp!=NULL){
        if(cnt==right){
            
              rightnode=temp;
             if(temp->next!=NULL){
             rightnodeNext=temp->next;
             }
             
             break;
        }
        temp=temp->next;
        cnt++;
       }
       if(temp->next==NULL){
        rightnodeNext=NULL;
       }
       ListNode* dummynode=new ListNode(0);
       ListNode* prev=NULL;
       ListNode* temp2=leftnode;
       while(temp2!=rightnodeNext){
        ListNode* front=temp2->next;
        temp2->next=prev;
        prev=temp2;
        temp2=front;
       }
       if(leftnodePrev==NULL){
        dummynode->next=prev; 
        leftnode->next=rightnodeNext;
      return dummynode->next;
       }
       else{
         leftnodePrev->next=prev;
       leftnode->next=rightnodeNext;
return head;
       }
      
       

    }
};