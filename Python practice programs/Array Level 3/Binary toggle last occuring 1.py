n=int(input())
temp=n
a=[]
while(temp!=0):
    a.append(temp%2)
    temp//=2
# print(a)
for i in range(len(a)-1):
    if(a[i]==1):
        a[i]=0
        break
#print(a)
decimal=0
count=0
for i in range(len(a)):
    decimal+=(a[i]*(2**count))
    count+=1
print(decimal)