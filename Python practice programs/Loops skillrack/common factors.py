x=int(input())
y=int(input())
if(x<y):
    min=x
else:
    min=y
i=1
while(i<=min):
    if(x%i==0 and y%i==0):
        print(i,"\t",end="")
    i+=1
