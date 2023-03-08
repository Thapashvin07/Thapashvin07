n=int(input())
temp=n
while(temp!=0):
    temp//=10
    if(temp//10==0):
        break
print(temp*10+n%10)