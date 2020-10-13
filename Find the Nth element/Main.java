#include <stdio.h>
#include<stdlib.h>
struct node{
  int data;
  struct node* next;
};
struct node* addnew(struct node *head,int value)
{
  struct node *temp=(struct node*)malloc(sizeof(struct node));
  temp->data=value;
  temp->next=NULL;
  if(head==NULL)
  {
    head=temp;
    return head;
  }
  struct node *t;
  t=head;
  while(t->next!=NULL)
    t=t->next;
  t->next=temp;
  return head;
}
int main() 
{
   // Try out your code here
    int num,ind,i,val[100];
  struct node* head=NULL;
  scanf("%d",&num);
  for(i=0;i<num;i++)
  {
    scanf("%d",&val[i]);
  }
  scanf("%d",&ind);
  for(i=0;i<num;i++)
  {
    	head=addnew(head,val[i]);
  }
  struct node *t;
  t=head;
  if(ind>num)
    printf("No node found\n");
  else
  {
    printf("%d\n",val[ind-1]);
  }
    
  return 0;
    
}