sum=0
m=int(input())
n=int(input())
x=int(input())
for i in range(m,n+1):
    if(i%x==0):
        sum+=i
if(sum!=0):
    print(sum)
else:
    print("-1")
