n=int(input())
sum=0
temp=n
while(temp!=0):
    rem=temp%10
    sum=sum+(rem*rem*rem)
    temp//=10
if(sum==n):
    print(n,"is armstrong")
else:
    print(n,"is not armstrong")