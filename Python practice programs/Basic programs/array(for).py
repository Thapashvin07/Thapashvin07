n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
sum=0
for i in range(n):
    sum+=a[i]
print(sum)