n=int(input())
sum=1
for i in range(2,n//2+1):
    if(n%i==0):
        sum+=i
if(sum==n):
    print(n,"is perfect")
else:
    print(n,"is not perfect")
