n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
for i in range(1,n-1):
    if (a[i]<=a[0] or a[i]>=a[n-1]):
        print("no")
        break
else:
    print("yes")