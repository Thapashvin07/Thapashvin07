count=0
s=input()
r=int(input())
c=int(input())
a=[]
for i in range(r):
    b=[]
    for j in range(c):
        b.append(input())
    a.append(b)
for i in range(r):
    for j in range(c-len(s)+1):
        k=j
        for l in range(len(s)):
            if(a[i][k]!=s[l]):
                break
            k+=1
        else:
            count+=1
print(count)