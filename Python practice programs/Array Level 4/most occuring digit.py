n=int(input())
a=[]
temp=n
while(temp!=0):
    a.append(temp%10)
    temp//=10
max_count=0
for i in range(len(a)-1,-1,-1):
    count=0
    for j in range(len(a)-1,-1,-1):
        if(a[i]==a[j]):
            count+=1
    if(count>max_count):
        max_count=count
        val=a[i]
print(val)