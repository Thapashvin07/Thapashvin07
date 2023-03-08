n = int(input())
a = []
for i in range(n):
    a.append(int(input()))
for i in range(n):
    if(a[i]<0):
        print(a[i],end=" ")
for i in range(n):
    if(a[i]==0):
        print(a[i],end=" ")
for i in range(n):
    if(a[i]>0):
        print(a[i],end=" ")