n=int(input())
k=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
for i in range(n):
    for j in range(i+1,n):
        if(a[j]>a[i]):
            temp=a[j]
            a[j]=a[i]
            a[i]=temp
print(a)
count=0
for i in range(0,n-1):
    if(a[i]>a[i+1]):
        count+=1
    if(count==k):
        print(a[i])
        break
else:
    print(a[len(a)-1])


#print(a[k-1])