n=int(input())
for i in range(1,n+1):
    j=i
    while(j!=0):
        if((j%10)%2==0):
            break
        j//=10
    else:
        print(i,end=" ")