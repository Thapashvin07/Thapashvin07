n = int(input())
a = []
for i in range(n):
    a.append(int(input()))
flag=0
for i in range(n):
    if((a[i]*2)%10!=2):
        print(a[i],end=" ")
        flag=1
if(flag!=1):
    print("-1")