n=int(input())
x=int(input())
i=1
k=1
while(i<=n):
    j=1
    while(j<=i):
        if(k%x==0):
            print("*",end=" ")
        else:
            print(k,end=" ")
        k+=1
        j+=1
    print()
    i+=1