k=1
n=int(input())
for i in range(1,2*n):
    for j in range(1,2*n):
        if i==j or i+j==2*n:
            print(k,end="")
        else:
            print(end=" ")
    if i<n:
        k+=1
    else:
        k-=1
    print()