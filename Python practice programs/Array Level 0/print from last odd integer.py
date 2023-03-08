n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
for i in range(n-1,-1,-1):
    if(a[i]%2!=0):
        print(a[i],end=" ")
        break
for j in range(i-1,-1,-1):
    print(a[j],end=" ")