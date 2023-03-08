n=int(input())
temp=n
while(temp!=0):
    if((temp%10)%2==0):
        print(temp%10,end="")
    temp//=10