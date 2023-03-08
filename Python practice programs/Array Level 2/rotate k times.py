n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
k=int(input())
for i in range(k):
    temp=a[len(a)-1]
    for j in range(len(a)-1,-1,-1):
        a[j]=a[j-1]
    a[0]=temp
print(a)
