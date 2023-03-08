n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
ce,co=0,0
for i in range(n):
    if(a[i]%2==0):
        ce+=1
    else:
        co+=1
if(ce>co):
    for i in range(n):
        if(a[i]%2==0):
            print(a[i]-1,end=" ")
        else:
            print(a[i],end=" ")
elif(ce<co):
    for i in range(n):
        if(a[i]%2!=0):
            print(a[i]+1,end=" ")
        else:
            print(a[i],end=" ")
else:
    for i in range(n):
        if(a[i]%2==0):
            print(a[i]-1,end=" ")
        else:
            print(a[i]+1,end=" ")
