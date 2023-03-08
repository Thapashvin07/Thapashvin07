start=int(input())
end=int(input())
flag=0
i=start
while(i<=end):
    sum=0
    j=i
    while(j):
        sum=sum+((j%10)*(j%10)*(j%10))
        j//=10
    if(sum==i):
        print(i,end=" ")
        flag=1
    i+=1
if(flag==0):
    print("-1")