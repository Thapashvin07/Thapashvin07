n=int(input())
i=n+1
while(i):
    j=2
    while(j<=i//2):
        if(i%j==0):
            break
        j+=1
    else:
        print(i)
        break
    i += 1