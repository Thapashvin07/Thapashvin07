n=int(input())
i=0
a=[]
temp=n
while(temp!=0):
    a.append(temp%6)
    temp//=6
    i+=1
for j in range(i-1,-1,-1):
    print(a[j],end="")
