a=[]
n=int(input())
k=int(input())
for i in range(n):
    a.append(int(input()))
for i in range(n-1):
    for j in range(n):
        if(a[i]+a[j]==k):
            print("yes")
            break
    if(j<n-1):
        break
else:
    print("no")