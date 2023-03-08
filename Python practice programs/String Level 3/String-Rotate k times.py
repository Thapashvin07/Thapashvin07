s1=input()
s2=input()
k=int(input())
a=list(s1)
for i in range(k):
    temp=a[len(a)-1]
    for j in range(len(a)-1,0,-1):
        a[j]=a[j-1]
    a[0]=temp
b=""
for i in range(len(a)):
    b+=a[i]
print(b)
if(b==s2):
    print("yes")
else:
    print("no")