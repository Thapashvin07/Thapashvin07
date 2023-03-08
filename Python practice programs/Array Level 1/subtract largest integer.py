n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
max=a[0]
for i in range(1,n):
    if(a[i]>max):
        max=a[i]
for i in range(n):
    print(max-a[i],end=" ")