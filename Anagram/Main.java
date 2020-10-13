#include <stdio.h>
int main()
{
   char str1[100];
   char str2[100];
  gets(str1);
  gets(str2);
 int map[255]={0};
  int i=0,j=0;
  while(str1[i] &&str2[j])
  {
    map[str1[i++]-'0']++;
    map[str2[j++]-'0']--;
  }
  for(i=0;i<255;i++)
  {
	if(map[i]!=0)
    {
      //printf("%d %d",i,map[i]);
      printf("Not Anagram");
    	return 0;
    }
  }
 printf("Anagram");
  return 0;
  
}