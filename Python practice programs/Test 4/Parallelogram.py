n=int(input())
c=1
for i in range(n):
    for j in range(i):
        print("-",end="")
    for k in range(n):
        if(not(i==0 or i==n-1 or k==0 or k==n-1)):
            print(c,end="")
            c+=1
        else:
            print("*",end="")
    print()