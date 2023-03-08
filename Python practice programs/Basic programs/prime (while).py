start=int(input())
end=int(input())
i=start
flag=0
while(i<=end):
    j=2
    while(j<=i//2):
        if(i%j==0):
            break;
        j+=1
    else:
        print(i,end=" ")
        flag=1
    i+=1
if(flag==0):
    print("-1")