def ispalindrome(n):
  l=len(str(n))
  d=10**(l-1)
  #print(d)
  while(n>9):
    lastdigit=n%10
    firstdigit=int(n/d)
    #print("firstdigit={0}".format(firstdigit))
    #print("lastdigit={0}".format(lastdigit))
    if(firstdigit!=lastdigit):
      return 0
    n=n%d
    n=int(n/d)
    d=d/100
  return 1
    
      




m=int(input())
n=int(input())
X=list()
for i in range(m,n+1):
  if ispalindrome(i):
    X.append(i)     
      
print(*X,sep=" ")
       
       
       