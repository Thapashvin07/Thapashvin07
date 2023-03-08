n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
i=0
flag=0
while i<n:
    if(a[i]%100==10):
        print(a[i],end=" ")
        flag=1
    i+=1
if(flag!=1):
    print("-1")