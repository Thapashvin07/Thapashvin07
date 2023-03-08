c=0
n=int(input())
a=[2]
for i in range(3,n+1):
    for j in range(2,i//2+1):
        if(i%j==0):
            break
    else:
        a.append(i)
for i in range(len(a)):
    for j in range(i+1,len(a)):
        if(a[i]+a[j]==n):
            c+=1
print(c)
