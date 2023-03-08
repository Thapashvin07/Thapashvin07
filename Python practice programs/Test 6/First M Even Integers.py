m=int(input())
n=int(input())
a=[]
for i in range(m):
    a.append(int(input()))
c=0
for i in range(len(a)):
    if(a[i]%2==0):
        print(a[i],end=" ")
        c+=1
    if(c==n):
        break
else:
    print("-1")
