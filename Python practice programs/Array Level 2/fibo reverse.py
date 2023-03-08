n=int(input())
a=-1
b=1
l=[]
for i in range(n):
    l.append(a+b)
    a=b
    b=l[i]
print(l[::-1])