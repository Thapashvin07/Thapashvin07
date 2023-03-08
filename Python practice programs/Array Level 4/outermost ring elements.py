r=int(input())
c=int(input())
a=[]
for i in range(r):
    b=[]
    for j in range(c):
        b.append(int(input()))
    a.append(b)
for i in range(r):
    for j in range(c):
        if(i==0 or j==0 or i==r-1 or j==c-1):
            print(a[i][j],end=" ")
        else:
            print("*",end=" ")
    print()