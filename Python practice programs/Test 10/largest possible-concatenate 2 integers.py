x=int(input())
y=int(input())
z=int(input())
if(x>y and x>z):
    max=x
    if(y>z):
        max2=y
    else:
        max2=z
if(y>x and y>z):
    max=y
    if(x>z):
        max2=x
    else:
        max2=z
if(z>y and x<z):
    max=z
    if(y>x):
        max2=y
    else:
        max2=x
print(str(max)+str(max2))



