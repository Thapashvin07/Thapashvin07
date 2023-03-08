n=int(input())
a=[]
flag=0
for i in range(n):
    b=[]
    for j in range(n):
        b.append(input())
    a.append(b)
s=input()
for i in range(n):
    for j in range(n-len(s)+1):
        k=j
        for l in range(len(s)):
            if(a[k][i]!=s[l]):
                break
            k+=1
        else:
            print(i+1,end=" ")
            flag=1
if(flag!=1):
    print("-1")