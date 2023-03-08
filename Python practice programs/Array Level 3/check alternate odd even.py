n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
for i in range(n-1):
    if(a[i]%2==a[i+1]%2):
        print("no")
        break
else:
    print("yes")