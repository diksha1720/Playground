/* C program to merge two sorted linked lists */
#include<stdio.h>
#include<stdlib.h>
#include<assert.h>

/* Link list node */
struct Node
{
	int data;
	struct Node* next;
};

/* pull off the front node of the source and put it in dest */
void MoveNode(struct Node** destRef, struct Node** sourceRef);

/* Takes two lists sorted in increasing order, and splices
their nodes together to make one big sorted list which
is returned. */
struct Node* SortedMerge(struct Node* a, struct Node* b)
{
	/* a dummy first node to hang the result on */
	struct Node dummy;

	/* tail points to the last result node */
	struct Node* tail = &dummy;

	/* so tail->next is the place to add new nodes
	to the result. */
	dummy.next = NULL;
	while (1)
	{
		if (a == NULL)
		{
			/* if either list runs out, use the
			other list */
			tail->next = b;
			break;
		}
		else if (b == NULL)
		{
			tail->next = a;
			break;
		}
		if (a->data <= b->data)
			MoveNode(&(tail->next), &a);
		else
			MoveNode(&(tail->next), &b);

		tail = tail->next;
	}
	return(dummy.next);
}

/* UTILITY FUNCTIONS */
/* MoveNode() function takes the node from the front of the
source, and move it to the front of the dest.
It is an error to call this with the source list empty.

Before calling MoveNode():
source == {1, 2, 3}
dest == {1, 2, 3}

Affter calling MoveNode():
source == {2, 3}
dest == {1, 1, 2, 3} */
void MoveNode(struct Node** destRef, struct Node** sourceRef)
{
	
	struct Node* newNode = *sourceRef;
	assert(newNode != NULL);

	*sourceRef = newNode->next;

	newNode->next = *destRef;

	*destRef = newNode;
}

void push(struct Node** head_ref, int new_data)
{
	struct Node* new_node =
		(struct Node*) malloc(sizeof(struct Node));
	new_node->data = new_data;
	new_node->next = NULL;
  if(*head_ref==NULL)
  {
    *head_ref=new_node;
    return;
  }
  struct Node* temp;
  temp=(*head_ref);
    while(temp->next)
      temp=temp->next;
	temp->next = new_node;
}
void printList(struct Node *node)
{
	while (node!=NULL)
	{
		printf("%d->", node->data);
		node = node->next;
	}
  printf("NULL");
}

int main()
{
	struct Node* res = NULL;
	struct Node* a = NULL;
	struct Node* b = NULL;
  int m,n;
	int i,j;
  scanf("%d",&m);
  for(i=0;i<m;i++)
  {
    int val;
    scanf("%d",&val);
    push(&a,val);
  }
  scanf("%d",&n);
  for(j=0;j<n;j++)
  {
    int val1;
    scanf("%d",&val1);
    push(&b,val1);
  }
	res = SortedMerge(a, b);
	printList(res);
	return 0;
}
