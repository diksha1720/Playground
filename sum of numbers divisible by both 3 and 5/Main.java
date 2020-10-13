
m=int(input())
n=int(input())
count=0
for i in range(m,n+1):
  if i%3==0 and i%5==0:
    count=count+i
print(count)  