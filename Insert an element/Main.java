n=int(input())
arr=list(map(int,input().split()))
st=list(map(int,input().split()))
ind=st[0]
val=st[1]

A=list()
j=0
for i in range(0,n+1):
  if i==ind-1:
    A.append(val)
  else:
    A.append(arr[j])
    j+=1
print(*A,sep=" ")