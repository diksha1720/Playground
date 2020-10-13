#include <stdio.h>
#include <string.h>
int main()
{
   // Try out your code here
  char str[1000];
  char ch1,ch2;
  scanf("%s %c %c",str,&ch1,&ch2);
  //printf("%s\n",str);
  //printf("%c\n",ch1);
  //printf("%c\n",ch2);
  int n=strlen(str);
  int i;
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]==ch1)
      str[i]=ch2;
    else if(str[i]==ch2)
      str[i]=ch1;
  }
  printf("%s",str);
  return 0;
}