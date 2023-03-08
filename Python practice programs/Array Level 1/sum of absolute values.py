n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
sum=0
for i in range(n):
    if(a[i]<0):
        sum-=a[i]
    else:
        sum+=a[i]
print(sum)