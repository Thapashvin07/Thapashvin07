n=int(input())
temp=n
a=[]
while(temp!=0):
    a.append(temp%10)
    temp//=10
for i in range(len(a)-3,len(a)):
    print(a[i],end="")