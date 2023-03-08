row=int(input())
col=int(input())
a=[]
for i in range(row):
    b=[]
    for j in range(col):
        b.append(int(input()))
    a.append(b)
sum=0
for i in range(row):
    for j in range(col):
        sum+=a[i][j]
print(sum)
