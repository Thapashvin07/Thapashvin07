n=int(input())
a=[]
sum=0
for i in range(n):
    a.append(int(input()))
for i in range(n):
    temp=a[i]
    count=0
    while(temp!=0):
        if((temp%10)%2!=0):
            count+=1
        temp//=10
    if(count>=2):
        sum+=a[i]
print(sum)