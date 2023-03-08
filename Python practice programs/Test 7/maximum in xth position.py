n=int(input())
max=0
a=[]
for i in range(n):
    a.append(int(input()))
x=int(input())
for i in range(n):
    c=1
    temp=a[i]
    while(temp!=0):
        if(c==x):
            break
        temp//=10
        c+=1
    if temp%10>max:
        max=temp%10
        val=a[i]
    elif(temp%10==max):
        if(val<a[i]):
            val=a[i]
print(val)
