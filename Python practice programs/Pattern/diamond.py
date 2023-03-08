n=int(input())
for i in range(1,n*2):
    if(i<=n):
        space=n-i
        val=i
    else:
        space=i-n
        val=2*n-i
    for j in range(space):
        print(" ",end="")
    for j in range(val):
        print("* ",end="")
    print()