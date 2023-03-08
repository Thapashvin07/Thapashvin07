n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
k=int(input())
for i in range(k):
    for j in range(i+1,k):
        if(a[j]<a[i]):
            temp=a[j]
            a[j]=a[i]
            a[i]=temp
for i in range(n-1):
    if(a[i]>a[i+1]):
        print("no")
        break
else:
    print("yes")