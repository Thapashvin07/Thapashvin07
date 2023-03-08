def rmvprime(a):
    sum=0
    for i in range(len(a)-1,-1,-1):
        if(not(a[i]==2 or a[i]==3 or a[i]==5 or a[i]==7)):
            sum=sum*10+a[i]
    return sum
x=int(input())
y=int(input())
temp=x
a=[]
while(temp!=0):
    a.append(temp%10)
    temp//=10
sum=rmvprime(a)
temp=y
a=[]
while(temp!=0):
    a.append(temp%10)
    temp//=10
sum+=rmvprime(a)
print(sum)