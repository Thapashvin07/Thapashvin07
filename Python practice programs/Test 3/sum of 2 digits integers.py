sum=0
n=int(input())
temp=n
while(temp!=0):
    sum+=temp%1000
    temp//=1000
print(sum)