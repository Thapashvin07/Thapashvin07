n=int(input())
for i in range(10,n+1):
    sume,sumo=0,0
    temp=i
    while(temp!=0):
        if((temp%10)%2==0):
            sume+=temp%10
        else:
            sumo+=temp%10
        temp//=10
    if(sumo==sume):
        print(i,end=" ")