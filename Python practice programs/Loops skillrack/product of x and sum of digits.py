n=int(input())
x=int(input())
temp=n
sum=0
while(temp):
    sum+=(temp%10)
    temp//=10
print(sum*x)