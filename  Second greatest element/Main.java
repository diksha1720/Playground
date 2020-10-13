#include <stdio.h>
int main()
{
   // Try out your code here
   int arr[1000];
  int max=-1000;
  int i,n,maxind;
  int flag=0;
  scanf("%d",&n);
  if(n<2)
  {
    printf("Invalid Input");
    return 0;
  }
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
    if(arr[i]>max)
    {
      maxind=i;
      max=arr[i];
    }
  }
  for(i=1;i<n;i++)
  {
    if(arr[i]!=arr[0])
      flag=1;
  }
  if(flag==0)
  {
  printf("There is no second largest element");
    return 0;
  }
  arr[maxind]=-1000;
  max=-1000;
  for(i=0;i<n;i++)
  {
    if(arr[i]>max)
      max=arr[i];
  }
  printf("%d",max);
  return 0;
}