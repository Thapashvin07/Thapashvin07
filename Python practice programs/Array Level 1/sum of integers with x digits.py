n=int(input())
x=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
sum=0
for i in range(n):
    count=0
    temp=a[i]
    while(temp!=0):
        count+=1
        temp//=10
    if(count==x):
        sum+=a[i]
if(sum==0):
    print("-1")
else:
    print(sum)
