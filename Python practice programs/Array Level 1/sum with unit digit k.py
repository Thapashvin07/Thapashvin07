n=int(input())
k=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
sum=0
for i in range(n):
    if(a[i]%10==k):
        sum+=a[i]
print(sum)