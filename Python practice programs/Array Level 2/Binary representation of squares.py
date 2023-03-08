n=int(input())
for i in range(1,n+1):
    a=[]
    j=i*i
    while(j!=0):
        a.append(j%2)
        j//=2
    for k in range(len(a)-1,-1,-1):
        print(a[k],end="")
    print("\t",end=" ")