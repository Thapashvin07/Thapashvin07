from goto import goto,label
n=int(input())
a=[]
for i in range(n):
    for j in range(2,n//2):
        if(i%j==0):
            break
    else:
        a.append(i)
for i in range(len(a),-1):
    for j in range(len(a)):
        if(a[i]+a[j]==n):
            print(i,j)
            goto.end
label.end
if(i==len(a)-1):
        print("-1")

