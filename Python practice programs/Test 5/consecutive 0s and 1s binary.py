n=int(input())
a=[]
temp=n
while(temp!=0):
    a.append(temp%2)
    temp//=2
print(a[0],end="")
for i in range(len(a)-2,-1,-1):
    if(a[i]==a[i+1]):
        print(a[i],end="")
    else:
        print()
        print(a[i],end="")