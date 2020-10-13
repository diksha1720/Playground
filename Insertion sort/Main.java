#include <stdio.h>
#include <stdlib.h>
void insertion_sort(int *A,int n)
{
  int i,j;
  for(i=0;i<n;i++)
  {
    int key=A[i];
    j=i-1;
    while(j>=0 && A[j]>key)
    {
      A[j+1]=A[j];
        j--;
    }
    A[j+1]=key;
}
}
int main()
{
  int *arr=(int*)malloc(1000* sizeof(int));
  int n;
  scanf("%d",&n);
  int i;
  for(i=0;i<n;i++)
    scanf("%d ",&arr[i]);
  insertion_sort(arr,n);
  for(i=0;i<n;i++)
    printf("%d ",arr[i]);
     
   return 0;
}