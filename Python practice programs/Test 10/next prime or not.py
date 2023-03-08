x=int(input())
y=int(input())
i=x+1
while(i!=0):
    for j in range(2,i//2+1):
        if(i%j==0):
            break
    else:
        if(i==y):
            print("yes")
            break
        else:
            print("no")
            break
    i+=1