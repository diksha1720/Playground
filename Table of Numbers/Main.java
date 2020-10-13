n=int(input())
A=list()
count=0
for i in range(1,11):
  A.append(n*i)
  count+=n*i
print(*A, sep=" ")
print(count)