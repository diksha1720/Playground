#include <stdio.h>
int main()
{
   // Try out your code here
   int num1,num2,count=0;
  scanf("%d %d",&num1,&num2);
  int c=0;
  while(num1>0 || num2>0)
  {
    int a=num1%10;
    int b=num2%10;
    if(a+b+c>9)
    {
      count++;
      c=1;
    }
    num1=num1/10;
    num2=num2/10;
  }
  printf("%d",count);
  return 0;
}