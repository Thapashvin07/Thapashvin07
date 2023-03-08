n=int(input())
a=[]
max_count=0
for i in range(n):
    a.append(int(input()))
for i in range(n):
    count=0
    for j in range(i+1,n):
        if(a[j]==a[i]):
            count+=1
        if(count>max_count):
            max_count=count
            val=a[i]
if(max_count==0):
    print("-1")
else:
    print(val)