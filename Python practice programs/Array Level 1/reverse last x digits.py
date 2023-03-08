n=int(input())
x=int(input())
temp=n
i=0
a=[]
while(temp!=0):
    a.append(temp%10)
    i+=1
    temp//=10
for j in range(i-1, i-x,-1):
    print(a[j], end="")
for i in range(x):
    print(a[i], end="")