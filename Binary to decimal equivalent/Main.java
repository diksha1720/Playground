arr=input()
#print(arr)
B=list()
for x in arr:
  B.append(int(x))
#print(B)
A=list(reversed(B))
#print(A)
sum=0
for i in range(0,len(A)):
  sum=sum+A[i]*(2**i)
print(sum)