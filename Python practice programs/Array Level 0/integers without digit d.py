n = int(input())
d=int(input())
a = []
for i in range(n):
    a.append(int(input()))
flag=0
for i in range(n):
    temp=a[i]
    while(temp!=0):
        if(temp%10==d):
            break;
        temp//=10
    else:
        print(a[i],end=" ")
        flag=1
if(flag==0):
    print("-1")