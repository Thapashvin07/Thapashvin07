n=int(input())
a=[]
temp=n
while(temp!=0):
    a.append(temp%10)
    temp//=10
if(n%2==0):
    for i in range(0,len(a)):
        if(a[i]%2!=0):
            break
    print(a[len(a)-1:i-1:-1])
else:
    for i in range(0,len(a)):
        if(a[i]%2==0):
            break
    print(a[len(a)-1:i-1:-1])
