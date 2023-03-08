import math
n=int(input())
temp=n
a=[]
while(temp!=0):
    a.append(temp%10)
    temp//=10
for i in range(len(a)-1,-1,-1):
    print("{:.2f}".format(math.sqrt(a[i])),end=" ")