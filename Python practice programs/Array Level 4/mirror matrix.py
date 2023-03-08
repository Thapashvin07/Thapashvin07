r=int(input())
c=int(input())
a=[]
for i in range(r):
    b=[]
    for j in range(c):
        b.append(int(input()))
    a.append(b)
for i in range(r):
    for j in range(c-1,-1,-1):
        temp = a[i][j]
        while(temp!=0):
            print(temp%10,end="")
            temp//=10
        print(" ",end=" ")
    print()
