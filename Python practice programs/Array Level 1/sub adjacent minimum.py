n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
print(a[1]-a[0],end=" ")
for i in range(1,n-1):
    if(a[i+1]<a[i-1]):
        print(a[i+1]-a[i],end=" ")
    else:
        print(a[i-1]-a[i],end=" ")
print(a[n-2]-a[n-1])