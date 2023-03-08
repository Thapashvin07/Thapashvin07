n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
for i in range(1,n):
    if(a[i]<=a[i-1]):
        print("no")
        break
else:
    print("yes")