n=input()
a1=list(map(int,input().split()))
a2=list(map(int,input().split()))
for var in a1:
        if var in a2:
        	a1.remove(var)
        	a2.remove(var)
for x in a2:
        if x in a1:
        	a1.remove(x)
        	a2.remove(x)
for y in a2:
  	a1.append(y)
print(*a1,sep=" ")
print(len(a1))
        
