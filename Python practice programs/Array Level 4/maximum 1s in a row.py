r=int(input())
c=int(input())
a=[]
for i in range(r):
    b=[]
    for j in range(c):
        b.append(int(input()))
    a.append(b)
max=0
for i in range(r):
    count=0
    for j in range(c):
        if(a[i][j]==1):
            count+=1
    if(count>max):
        max=count
print(max)
