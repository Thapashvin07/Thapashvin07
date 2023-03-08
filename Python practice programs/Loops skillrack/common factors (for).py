x=int(input())
y=int(input())
if(x<y):
    min=x
else:
    min=y
for i in range(1,min+1):
    if(x%i==0 and y%i==0):
        print(i,end=" ")
