n=int(input())
arr=list(map(int,input().split()))
key=int(input())
if key in arr:
  index=arr.index(key)
  print('index = {0}'.format(index))
else:
  print("-1")