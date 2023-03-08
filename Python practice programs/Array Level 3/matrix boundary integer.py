r=int(input())
c=int(input())
k=int(input())
a=[]
for i in range(r):
    b=[]
    for j in range(c):
        b.append(int(input()))
    a.append(b)
for i in range(r):
    for j in range(c):
        if(i==0 or i==r-1 or j==0 or j==c-1):
            if(a[i][j]!=k):
                break
    if(j!=c-1):
        print("no")
        break
else:
    print("yes")
