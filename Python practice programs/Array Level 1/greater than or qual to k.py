n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
k=int(input())
for i in range(n):
    if a[i]<k:
        print("No")
        break
else:
    print("Yes")