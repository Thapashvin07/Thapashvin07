m=int(input())
n=int(input())
a=[]
for i in range(m):
    b=[]
    for j in range(m):
        b.append(input())
    a.append(b)
for i in range(m):
    for j in range(m):
        if((i<n and j<n)or(i<n and j>=m-n)or (i>=m-n and j<n) or (i>=m-n and j>=m-n)):
            print(a[i][j],end=" ")
        else:
            print("*",end=" ")
    print()