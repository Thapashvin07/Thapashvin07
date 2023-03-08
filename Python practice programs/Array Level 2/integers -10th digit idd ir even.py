n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
c1=0
c2=0
for i in range(n):
    if(((a[i]//10)%10)%2==0):
        c2+=1
    else:
        c1+=1
if(c1>c2):
    for i in range(n):
        if (((a[i] // 10) % 10) % 2 != 0):
            print(a[i],end=" ")
elif(c2>c1):
    for i in range(n):
        if (((a[i] // 10) % 10) % 2 == 0):
            print(a[i],end=" ")

