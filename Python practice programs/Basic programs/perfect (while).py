start=int(input())
end=int(input())
i=start
while(i<=end):
    j=2
    sum=1
    while(j<=i//2):
        if(i%j==0):
            sum+=j
        j+=1
    if(sum==i):
        print(i,end=" ")
        flag=1
    i+=1
if(flag==0):
    print("-1")
