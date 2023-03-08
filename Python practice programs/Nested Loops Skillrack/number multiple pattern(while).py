n=int(input())
i=1
k=1
while(i<=n):
    j=1
    while(j<=i):
        print(i*j,end=" ")
        k+=1
        j+=1
    print()
    i+=1