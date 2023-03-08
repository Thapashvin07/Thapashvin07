r=int(input())
c=int(input())
a=[]
for i in range(r):
    b=[]
    for j in range(c):
        b.append(int(input()))
    a.append(b)
for i in range(r):
    if((i+1)%2!=0):
        for j in range(c):
            if(a[i][j]==0):
                print(a[i][j],end=" ")
        for j in range(c):
            if(a[i][j]!=0):
                print(a[i][j],end=" ")
        print()
    else:
        for j in range(c):
            if(a[i][j]!=0):
                print(a[i][j],end=" ")
        for j in range(c):
            if(a[i][j]==0):
                print(a[i][j],end=" ")
        print()