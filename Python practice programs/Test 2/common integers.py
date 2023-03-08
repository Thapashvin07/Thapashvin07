x1=int(input())
y1=int(input())
x2=int(input())
y2=int(input())
flag=0
if(x1<y1):
    for i in range(x1,y1+1):
        if(x2<y2):
            for j in range(x2,y2+1):
                if(i==j):
                    print(i,end=" ")
                    flag=1
        else:
            for j in range(y2,x2+1):
                if(i==j):
                    print(i,end=" ")
                    flag=1
else:
    for i in range(y1,x1+1):
        if(x2<y2):
            for j in range(x2,y2+1):
                if(i==j):
                    print(i,end=" ")
                    flag=1
        else:
            for j in range(y2,x2+1):
                if(i==j):
                    print(i,end=" ")
                    flag=1
if(flag!=1):
    print("-1")