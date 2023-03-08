n=int(input())
temp=n
while(temp!=1):
    print("2",end="")
    temp//=2
    if(temp!=1):
        print("*",end="")