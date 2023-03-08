flag=0
n=int(input())
a=[]
temp=n
while(temp!=0):
    a.append(temp%10)
    temp//=10
for i in range(len(a)-1,-1,-1):
    if(i==len(a)-1):
        if(a[len(a)-2]%2==0):
            print(a[i],end="")
            flag=1
    elif(i == 0):
        if (a[1] % 2 == 0):
            print(a[i], end="")
            flag = 1
    else:
        if a[i-1]%2==0 and a[i+1]%2==0:
            print(a[i],end="")
            flag=1
if(flag==0):
    print("-1")