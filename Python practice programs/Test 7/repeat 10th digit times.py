n=int(input())
c=0
temp=n
while(temp!=0):
    temp//=10
    c+=1
count=c-1
temp=n
while(count!=-1):
    rem=temp//(10**count)
    for i in range((n//10)%10):
        print(rem,end="")
    temp=temp%(10**count)
    count-=1
