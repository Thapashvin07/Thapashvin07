n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
x=int(input())
for i in range(x):
    if(a[i]!=a[n-x+i]):
        print("NO")
        break
else:
    print("YES")