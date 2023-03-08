x=int(input())
y=int(input())
z=int(input())
i=1
while(i):
    if(not(i>=x and i<=y)and(i%z==0)):
        break
    i+=1
print(i)
