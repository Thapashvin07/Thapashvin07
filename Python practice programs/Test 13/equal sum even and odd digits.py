n=int(input())
for i in range(1,n+1):
    sum_o,sum_e=0,0
    temp=i
    while(temp!=0):
        if((temp%10)%2==0):
            sum_e+=temp%10
        else:
            sum_o+=temp%10
        temp//=10
    if(sum_e==sum_o):
        print(i,end=" ")