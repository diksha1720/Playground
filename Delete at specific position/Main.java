#include <stdio.h>
int main()
{
  int *arr=(int*)malloc(sizeof(int));
  int n,i;
  int ind;
  scanf("%d",&n);
  for(i=0;i<n;i++)
    scanf("%d ",&arr[i]);
  scanf("%d",&ind);
  if(ind>n)
    printf("Deletion not possible.\n");
  else{
    for(i=ind-1;i<n-1;i++)
    {
     
        arr[i]=arr[i+1];
      
    }
    for(i=0;i<n-1;i++)
      printf("%d ",arr[i]);
  }
  return 0;
}