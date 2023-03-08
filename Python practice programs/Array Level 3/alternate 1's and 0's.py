n=int(input())
temp=n
a=[]
while(temp!=0):
    a.append(temp%2)
    temp//=2
for i in range(len(a)-1,0,-1):
    if(a[i]==a[i-1]):
        print("no")
        break
else:
    print("yes")