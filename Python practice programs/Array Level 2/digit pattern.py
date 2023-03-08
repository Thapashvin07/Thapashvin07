n=int(input())
a=[]
temp=n
while(temp!=0):
    a.append(temp%10)
    temp//=10
for i in range(len(a)-1,-1,-1):
    print("|",end="")
    for j in range(a[i]):
        print("*",end="")
    print()