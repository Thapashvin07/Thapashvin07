n=int(input())
a=[]
max_sum=0
for i in range(n):
    a.append(int(input()))
for i in range(n//2+1):
    sum=a[i]
    for j in range(i+1,n):
        if(a[i]%10==a[j]%10):
            sum+=a[j]
    if(sum>max_sum):
        max_sum=sum
print(max_sum)