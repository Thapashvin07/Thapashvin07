n=int(input())
sum=0
for i in range(1,n+1):
    for j in range(2,i//2+1):
        if(i%j==0):
            break
    else:
        if(i%10==7):
            sum+=i
print(sum)