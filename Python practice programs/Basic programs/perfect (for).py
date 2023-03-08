start=int(input())
end=int(input())
sum=0
for i in range(1,end+1):
    sum=1
    for j in range(2,i//2+1):
        if(i%j==0):
            sum+=j
    if(sum==i):
        print(i,end=" ")
        flag=1
if(flag==0):
    print("-1")
