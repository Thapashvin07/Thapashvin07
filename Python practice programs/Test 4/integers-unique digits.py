x=int(input())
y=int(input())
flag,c=0,0
for i in range(x,y+1):
    j=i
    while(j!=0):
        c=0
        temp=i
        while(temp!=0):
            if(j%10==temp%10):
                c+=1
            temp//=10
        if(c>1):
            break
        j//=10
    if(c==1):
        print(i,end=" ")
        flag=1
if(flag==0):
    print("-1")