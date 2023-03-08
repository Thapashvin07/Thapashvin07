n=int(input())
k=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
min=a[0]
for i in range(n):
    c=0
    temp=a[i]
    while(temp!=0):
        temp//=10
        c+=1
    if(c==k):
        if(a[i]<min):
            min=a[i]
if(min==0):
    print("-1")
else:
    print(min)
