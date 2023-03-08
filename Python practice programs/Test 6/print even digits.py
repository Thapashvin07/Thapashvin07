n=int(input())
a=[]
flag=0
for i in range(n):
    a.append(int(input()))
for i in range(len(a)):
    temp=a[i]
    while(temp!=0):
        if((temp%10)%2!=0):
            break
        temp//=10
    else:
        print(a[i],end=" ")
        flag=1
if(flag==0):
    print("-1")