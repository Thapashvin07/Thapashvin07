x=int(input())
y=int(input())
k=int(input())
c=0
temp=k
count=0
while(temp!=0):
    temp//=10
    c+=1
for i in range(x,y+1):
    temp=i
    while(temp>24):
        if(temp%100==25):
            count+=1
            break
        temp//=10
print(count)