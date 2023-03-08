n=int(input())
a=[]
i=0
while(i<n):
    a.append(int(input()))
    i+=1
for i in range(n):
    print("{:.2f}".format(a[i]/(a[i]%10)),end=" ")