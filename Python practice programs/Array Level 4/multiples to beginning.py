n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
for i in range(n):
    if(a[i]%10!=0):
        for j in range(i+1,n):
            if(a[j]%10==0):
                temp=a[j]
                a[j]=a[i]
                a[i]=temp
                break
print(a)