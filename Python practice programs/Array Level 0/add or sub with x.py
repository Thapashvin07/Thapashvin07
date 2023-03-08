n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
x=int(input())
for i in range(n):
    if(a[i]%2==0):
        print(a[i]+x,end=" ")
    else:
        print(a[i]-x,end=" ")
