 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    
    int carry = (l1-> val + l2-> val) / 10;
    struct ListNode* headList = (struct ListNode*) malloc(sizeof(struct ListNode));
    headList->val = (l1-> val + l2->val) % 10;
    headList->next = NULL;
    struct ListNode* tailList = headList;
    l1 = l1->next;
    l2 = l2->next;
    
    while(l1!=NULL && l2!=NULL){
        struct ListNode* listNode = (struct ListNode*) malloc(sizeof(struct ListNode));
        listNode->val = (l1-> val + l2->val + carry) % 10 ;
        listNode->next = NULL;
        carry  = (l1-> val + l2-> val + carry) / 10;
        tailList->next = listNode;
        tailList = listNode;
        l1 = l1->next;
        l2 = l2->next;
    }
    
    if(l1==NULL&&l2!=NULL)
    {
        while(l2!=NULL){
            struct ListNode* listNode = (struct ListNode*) malloc(sizeof(struct ListNode));
            listNode->val = (l2->val + carry) % 10 ;
            listNode->next=NULL;
            carry = (l2->val + carry)/10 ;
            tailList->next = listNode;
            tailList = listNode;
            l2 = l2->next;
        }
        if(carry!=0){
            struct ListNode* listNode = (struct ListNode*) malloc(sizeof(struct ListNode));
            listNode->val = carry ;
            listNode->next=NULL;
            tailList->next = listNode;
            tailList = listNode;
        }
    }    
    else if(l2==NULL&&l1!=NULL)
    {
        while(l1!=NULL){
            struct ListNode* listNode = (struct ListNode*) malloc(sizeof(struct ListNode));
            listNode->val = (l1->val + carry) % 10 ;
            listNode->next=NULL;
            carry = (l1->val + carry)/10 ;
            tailList->next = listNode;
            tailList = listNode;
            l1 = l1->next;
        }
        if(carry!=0){
            struct ListNode* listNode = (struct ListNode*) malloc(sizeof(struct ListNode));
            listNode->val = carry ;
            listNode->next=NULL;
            tailList->next = listNode;
            tailList = listNode;
        }
    }
    else {
        if(carry!=0){
            struct ListNode* listNode = (struct ListNode*) malloc(sizeof(struct ListNode));
            listNode->val = carry ;
            listNode->next=NULL;
            tailList->next = listNode;
            tailList = listNode;
        }
    }
    
    return headList;
}

///// Comments: (1) Think about test cases before writing the program
                (2) Assign inital value to all variables