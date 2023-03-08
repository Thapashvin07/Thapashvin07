m=int(input())
n=int(input())
a=[]
for i in range(m):
    b=[]
    for j in range(n):
        b.append(int(input()))
    a.append(b)
for i in range(n+2):
    print("*",end=" ")
print()
for i in range(m):
    print("*", end=" ")
    for j in range(n):
        print(a[i][j], end=" ")
    print("*")
for i in range(n+2):
    print("*",end=" ")