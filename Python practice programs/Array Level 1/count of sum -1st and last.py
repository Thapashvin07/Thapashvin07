n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
count=0
for i in range(n):
    if(a[i]==a[0]+a[n-1]):
        count+=1
print(count)
