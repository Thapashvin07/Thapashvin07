n=int(input())
sum=1
i=2
while(i<=n//2):
    if(n%i==0):
        sum+=i
    i+=1
if(sum==n):
    print(n,"is perfect")
else:
    print(n,"is not perfect")