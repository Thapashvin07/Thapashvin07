n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
flag=0
for i in range(n):
    sum=0
    temp=a[i]
    while(temp!=0):
        sum+=temp%10
        temp//=10
    if(a[i]%sum==0):
        print(a[i],end=" ")
        flag=1
if(flag==0):
    print("-1")