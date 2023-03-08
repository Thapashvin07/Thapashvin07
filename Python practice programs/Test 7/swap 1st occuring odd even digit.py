x=int(input())
a=[]
temp=x
while(temp!=0):
    a.append(temp%10)
    temp//=10
for i in range(len(a)-1,-1,-1):
    if(a[i]%2==0):
        break
for j in range(len(a)-1,-1,-1):
    if(a[j]%2!=0):
        break
temp=a[j]
a[j]=a[i]
a[i]=temp
print(a[::-1])