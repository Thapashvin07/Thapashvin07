n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
for i in range(n):
    for j in range(i+1,n):
        if(a[j]>a[i]):
            temp=a[j]
            a[j]=a[i]
            a[i]=temp
print(a[len(a)-1],a[0])