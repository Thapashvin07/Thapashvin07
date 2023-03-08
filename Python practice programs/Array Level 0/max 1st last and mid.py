n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
if(a[0]>a[n-1]):
    if(a[0]>a[n//2]):
        print(a[0])
    else:
        print(a[n//2])
else:
    if(a[n-1]>a[n//2]):
        print(a[n-1])
    else:
        print(a[n//2])