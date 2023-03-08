x=int(input())
y=int(input())
z=int(input())
if((x>y)and(x>z)):
    max=x
    if(y<z):
        min=y
    else:
        min=z
elif((y>x)and(y>z)):
    max=y
    if(x<z):
        min=x
    else:
        min=z
elif((z>x)and(z>y)):
    max=z
    if(x<y):
        min=x
    else:
        min=y
for i in range(max,min-1,-1):
    print(i,end=" ")