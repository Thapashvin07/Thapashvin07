n=int(input())
x=int(input())
k=1
for i in range(1,n+1):
    for j in range(1,i+1):
        if(k%x==0):
            print("*",end=" ")
        else:
            print(k,end=" ")
        k+=1
    print()