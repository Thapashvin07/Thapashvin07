n=int(input())
k=1
for i in range(1,n+1):
    sum=0
    for j in range(1,i+1):
        sum+=k
        k+=1
    print(sum)