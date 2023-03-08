x=int(input())
y=int(input())
z=int(input())
if(x<z):
    min=x
    min2=z
else:
    min=z
    min2=x
for i in range(min,min2-1):
    print(i,end=" ")
for i in range(y,min2-1,-1):
    print(i,end=" ")