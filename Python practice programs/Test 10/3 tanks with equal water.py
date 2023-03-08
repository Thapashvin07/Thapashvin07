x=int(input())
y=int(input())
z=int(input())
if(x>y and x>z):
    max=x
elif(y>x and y>z):
    max=y
elif(z>x and z>y):
    max=z
print((max-x)+(max-y)+(max-z))