max=0
n=int(input())
a=[]
for i in range(n):
    a.append(int(input()))
for i in range(n):
    temp=a[i]
    count=0
    while(temp!=0):
        temp//=10
        count+=1
    if(count>=max):
        max=count
    else:
        print("no")
        break
else:
    print("yes")