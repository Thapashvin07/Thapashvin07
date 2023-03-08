n=int(input())
flag=0
for i in range(2,n+1):
    temp=i
    while(temp!=0):
        if(not(temp%10==(temp//10)%10+1 or temp%10==(temp//10)%10-1)):
            break
        temp//=10
    else:
        print(i,end=" ")
        flag=1
if(flag==0):
    print("-1")