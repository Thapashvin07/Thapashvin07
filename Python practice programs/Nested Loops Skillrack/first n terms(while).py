n=int(input())
k=1
i=1
while(i<=n):
    sum=0
    j=1
    while j<=i:
        sum+=k
        k+=1
        j+=1
    print(sum)
    i+=1