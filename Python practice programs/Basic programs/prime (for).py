start=int(input())
end=int(input())
flag=0
for i in range(start,end+1):
    for j in range(2,i//2):
        if(i%j==0):
            break
    else:
        print(i)
        flag=1
if(flag==0):
    print("-1")