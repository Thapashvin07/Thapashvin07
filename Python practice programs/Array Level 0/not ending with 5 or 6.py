n=int(input())
x=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
flag=0
for i in range(n):
    if(((a[i]**2 +x)%10!=5)and ((a[i]**2 +x)%10!=5)):
        print(a[i]**2 +x,end=" ")