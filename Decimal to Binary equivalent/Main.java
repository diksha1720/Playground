n=int(input())
arr=list()
i=0
while n>0:
  arr.append(n%2)
  n=int(n/2)
A=list( reversed(arr))
print(*A, sep="")