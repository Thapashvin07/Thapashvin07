n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
for i in range(n):
    product=1
    temp=a[i]
    while(temp!=0):
        product*=(temp%10)
        temp//=10
    print(product,end=" ")