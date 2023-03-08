x=int(input())
y=int(input())
z=int(input())
if(x<y and x<z):
    min=x
elif(y<z and y<x):
    min=y
elif(z<x and z<y):
    min=z
for i in range(min,0,-1):
    if(x%i==0 and y%i==0 and z%i==0):
        print(i)
        break