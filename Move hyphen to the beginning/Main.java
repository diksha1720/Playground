#include <stdio.h>
#include <string.h>
#include <stdlib.h>
char* MoveHyphen(char str[], int n)
{
  int i=0,k=0,l=0;
  char sub[100];
  while(str[i])
  {
    if(str[i]!='-')
      sub[k++]=str[i];
    else
      str[l++]=str[i];
    i++;
  }
  for(i=0;i<k;i++)
    str[l++]=sub[i];
  str[l]='\0';
  printf("%s",str);
}
int main()
{
   // Try out your code here
   char str[100];
  scanf("%s",str);
  MoveHyphen(str,strlen(str));
  
  return 0;
}