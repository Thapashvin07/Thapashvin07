n=int(input())
a=[]
temp=n
while(temp!=0):
    a.append(temp%10)
    temp//=10
for i in range(a[len(a)-1]):
    for j in range(len(a)-1,-1,-1):
        for k in range(a[len(a)-1]):
            print(a[j],end="")
    print()