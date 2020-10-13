import re
str1=input()
str2=input()
lst1=[]
lst1[:0]=str1
for i in range(0,len(lst1)):
  if lst1[i]=='+':
    lst1[i]=lst1[i-1]
str11=""
for x in lst1:
  str11+=x
res=re.search(str11,str2)
if(res==None):
  print("Not Matched")
else:
  print("Matched")
  
