n=int(input())
a=[]
i=0
while(i<n):
    a.append(int(input()))
    i+=1
sum=0
i=0
while(i<n):
    sum+=a[i]
    i+=1
print(sum)