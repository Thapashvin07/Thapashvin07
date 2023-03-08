n=int(input())
sum=0
a=[]
for i in range(n):
    a.append(int(input()))
max=a[0]
for i in range(1,n):
    if(a[i]>max):
        max=a[i]
temp=max
while(temp!=0):
        sum+=temp%10
        temp//=10
for i in range(n):
    print("{:.2f}".format(a[i]/sum),end=" ")