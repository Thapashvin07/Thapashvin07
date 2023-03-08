n=int(input())
a=[]
max=0
for i in range(n):
    a.append(int(input()))
for i in range(n):
    temp=a[i]
    sum=0
    while(temp!=0):
        sum+=temp%10
        temp//=10
    if(sum>max):
        max=sum
        val=a[i]
    elif(sum==max):
        if(a[i]>val):
            val=a[i]
print(val)